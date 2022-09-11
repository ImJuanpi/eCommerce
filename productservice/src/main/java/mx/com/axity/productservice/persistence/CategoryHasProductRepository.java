package mx.com.axity.productservice.persistence;

import java.util.List;
import mx.com.axity.productservice.model.CategoryHasProductDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryHasProductRepository extends CrudRepository<CategoryHasProductDO, Long> {
    /**
     *
     * @param categoryidCategory
     * @return
     */
    CategoryHasProductDO findBycategoryidCategory(int categoryidCategory);
}
