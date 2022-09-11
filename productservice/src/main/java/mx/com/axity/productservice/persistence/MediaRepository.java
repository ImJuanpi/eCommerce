package mx.com.axity.productservice.persistence;

import java.util.List;
import mx.com.axity.productservice.model.MediaDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends CrudRepository<MediaDO, Long> {
    /**
     *
     * @param idMedia
     * @return
     */
    MediaDO findByidMedia(int idMedia);
    /**
     *
     * @param dsUser_idUser
     * @return

    List<MediaDO> findAllByuser(int dsUser_idUser);*/

}
