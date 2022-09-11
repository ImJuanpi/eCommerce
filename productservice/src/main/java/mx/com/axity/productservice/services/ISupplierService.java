package mx.com.axity.productservice.services;

import mx.com.axity.productservice.commons.to.SupplierTO;
import java.util.List;

public interface ISupplierService {
    List<SupplierTO> getAll();
    SupplierTO getbyid(int id);
}
