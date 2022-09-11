package mx.com.axity.userservice.services;

import java.util.List;
import mx.com.axity.userservice.commons.to.AddressTO;
import mx.com.axity.userservice.commons.to.ResponseTO;

public interface IAddressService {

    AddressTO getAddressById(int idAddress);
    List<AddressTO> getAddressByCustomerId(int dsUser_idUser);
    List<AddressTO> getAllAddress();
    ResponseTO createAddress(AddressTO idAddress);
    ResponseTO updateAddress(int idAddress, AddressTO address);
    ResponseTO deleteAddress(int idAddress, AddressTO address);
}
