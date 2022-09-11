package mx.com.axity.productservice.services;

import mx.com.axity.productservice.commons.to.CategoryTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryTO> getAll();
    CategoryTO getbyid(int id);
}