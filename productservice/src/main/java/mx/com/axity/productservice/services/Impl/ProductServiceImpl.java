package mx.com.axity.productservice.services.Impl;

import mx.com.axity.productservice.commons.to.MediaTO;
import mx.com.axity.productservice.commons.to.ProductTO;
import mx.com.axity.productservice.model.MediaDO;
import mx.com.axity.productservice.model.ProductDO;
import mx.com.axity.productservice.persistence.ProductRepository;
import mx.com.axity.productservice.services.IProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService{
    static final Logger LOG = LogManager.getLogger(CategoryHasProductServiceImpl.class);

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductTO> getAll() {
        LOG.info("Obteniendo todos los datos ");

        List<ProductDO> productDO =  (List<ProductDO>) productRepository.findAll();

        return productDO.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductTO getbyid(int id){
        LOG.info("Obteniendo valor para el parámetro " + id);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductDO productDO = productRepository.findByidProduct(id);
        ProductTO returnValue = modelMapper.map(productDO, ProductTO.class);

        return returnValue;
    }

    private ProductTO convertToTO(ProductDO product) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        ProductTO productTO = modelMapper.map(product, ProductTO.class);

        return productTO;
    }
}
