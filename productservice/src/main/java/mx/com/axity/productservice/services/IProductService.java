package mx.com.axity.productservice.services;

import mx.com.axity.productservice.commons.to.ProductTO;
import java.util.List;

public interface IProductService {
    List<ProductTO> getAll();
    ProductTO getbyid(int id);
}
