package mx.com.axity.userservice.persistence;

import java.util.List;
import mx.com.axity.userservice.model.AddressDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressDO, Long> {
    /**
     *
     * @param idAddress
     * @return
     */
    AddressDO findByidAddress(int idAddress);
    /**
     *
     * @param dsUser_idUser
     * @return
     */
    List<AddressDO> findAllByuser(int dsUser_idUser);

}
