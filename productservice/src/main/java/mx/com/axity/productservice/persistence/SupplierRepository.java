package mx.com.axity.productservice.persistence;

import java.util.List;
import mx.com.axity.productservice.model.SupplierDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends CrudRepository<SupplierDO, Long> {
    /**
     *
     * @param idSupplier
     * @return
     */
    SupplierDO findByidSupplier(int idSupplier);
    /**
     *
     * @param dsUser_idUser
     * @return

    List<SupplierDO> findAllByuser(int dsUser_idUser);   */

}

