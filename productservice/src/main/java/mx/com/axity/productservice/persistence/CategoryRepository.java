package mx.com.axity.productservice.persistence;

import java.util.List;
import mx.com.axity.productservice.model.CategoryDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryDO, Long> {
    /**
     *
     * @param idCategory
     * @return
     */
    CategoryDO findByidCategory(int idCategory);
    /**
     *
     * @param dsUser_idUser
     * @return

    List<CategoryDO> findAllByuser(int dsUser_idUser); */
}
