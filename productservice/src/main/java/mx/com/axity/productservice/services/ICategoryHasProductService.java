package mx.com.axity.productservice.services;

import java.util.List;
import mx.com.axity.productservice.commons.to.CategoryHasProductTO;
import mx.com.axity.productservice.commons.to.ResponseTO;

public interface ICategoryHasProductService {
    List<CategoryHasProductTO> getAll();
}
