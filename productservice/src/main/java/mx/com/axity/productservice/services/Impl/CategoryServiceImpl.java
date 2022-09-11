package mx.com.axity.productservice.services.Impl;

import mx.com.axity.productservice.commons.to.CategoryTO;
import mx.com.axity.productservice.model.CategoryDO;
import mx.com.axity.productservice.persistence.CategoryRepository;
import mx.com.axity.productservice.services.ICategoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements ICategoryService {
    static final Logger LOG = LogManager.getLogger(CategoryHasProductServiceImpl.class);

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryTO> getAll() {
        LOG.info("Obteniendo todos los datos ");

        List<CategoryDO> categoryDO =  (List<CategoryDO>) categoryRepository.findAll();

        return categoryDO.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryTO getbyid(int id){
        LOG.info("Obteniendo valor para el parámetro " + id);

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        CategoryDO categoryDO = categoryRepository.findByidCategory(id);
        CategoryTO returnValue = modelMapper.map(categoryDO, CategoryTO.class);

        return returnValue;
    }

    private CategoryTO convertToTO(CategoryDO category) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        CategoryTO categoryTO = modelMapper.map(category, CategoryTO.class);

        return categoryTO;
    }
}
