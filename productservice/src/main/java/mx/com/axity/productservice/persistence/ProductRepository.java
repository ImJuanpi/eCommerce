package mx.com.axity.productservice.persistence;

import java.util.List;
import mx.com.axity.productservice.model.ProductDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductDO, Long> {
    /**
     *
     * @param idProduct
     * @return
     */
    ProductDO findByidProduct(int idProduct);
    /**
     *
     * @param dsUser_idUser
     * @return

    List<ProductDO> findAllByuser(int dsUser_idUser);   */

}
