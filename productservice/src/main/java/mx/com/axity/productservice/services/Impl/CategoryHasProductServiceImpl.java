package mx.com.axity.productservice.services.Impl;

import mx.com.axity.productservice.commons.to.CategoryHasProductTO;
import mx.com.axity.productservice.services.ICategoryHasProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.netflix.discovery.converters.Auto;
import mx.com.axity.productservice.commons.to.CategoryHasProductTO;

import mx.com.axity.productservice.persistence.CategoryHasProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import mx.com.axity.productservice.commons.to.ResponseTO;
import mx.com.axity.productservice.model.CategoryHasProductDO;
import mx.com.axity.productservice.persistence.CategoryHasProductRepository;
import mx.com.axity.productservice.services.ICategoryHasProductService;

@Service
public class CategoryHasProductServiceImpl implements ICategoryHasProductService {

    static final Logger LOG = LogManager.getLogger(CategoryHasProductServiceImpl.class);

    @Autowired
    CategoryHasProductRepository categoryHasProductRepository;

    @Override
    public List<CategoryHasProductTO> getAll() {
        LOG.info("Obteniendo todos los datos ");

        List<CategoryHasProductDO> categoryHasProductDO =  (List<CategoryHasProductDO>) categoryHasProductRepository.findAll();

        return categoryHasProductDO.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    private CategoryHasProductTO convertToTO(CategoryHasProductDO categoryHasProduct) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        CategoryHasProductTO categoryHasProductTO = modelMapper.map(categoryHasProduct, CategoryHasProductTO.class);

        return categoryHasProductTO;
    }
}
