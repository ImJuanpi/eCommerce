package mx.com.axity.productservice.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import mx.com.axity.productservice.commons.to.MediaTO;
import mx.com.axity.productservice.commons.to.ProductTO;
import mx.com.axity.productservice.commons.to.SupplierTO;
import mx.com.axity.productservice.model.MediaDO;
import mx.com.axity.productservice.model.ProductDO;
import mx.com.axity.productservice.model.SupplierDO;
import mx.com.axity.productservice.persistence.ProductRepository;
import mx.com.axity.productservice.persistence.SupplierRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.axity.productservice.services.ISupplierService;

@Service
public class SupplierServiceImpl implements ISupplierService {
    static final Logger LOG = LogManager.getLogger(CategoryHasProductServiceImpl.class);

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public List<SupplierTO> getAll() {
        LOG.info("Obteniendo todos los datos ");

        List<SupplierDO> supplierDO =  (List<SupplierDO>) supplierRepository.findAll();

        return supplierDO.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    @Override
    public SupplierTO getbyid(int id){
        LOG.info("Obteniendo valor para el parámetro " + id);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        SupplierDO supplierDO = supplierRepository.findByidSupplier(id);
        SupplierTO returnValue = modelMapper.map(supplierDO, SupplierTO.class);

        return returnValue;
    }

    private SupplierTO convertToTO(SupplierDO supplier) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        SupplierTO supplierTO = modelMapper.map(supplier, SupplierTO.class);

        return supplierTO;
    }
}
