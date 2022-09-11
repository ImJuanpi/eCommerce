package mx.com.axity.userservice.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.netflix.discovery.converters.Auto;
import mx.com.axity.userservice.commons.to.AddressTO;

import mx.com.axity.userservice.persistence.AddressRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.axity.userservice.commons.to.ResponseTO;
import mx.com.axity.userservice.model.AddressDO;
import mx.com.axity.userservice.persistence.AddressRepository;
import mx.com.axity.userservice.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {

    static final Logger LOG = LogManager.getLogger(AddressServiceImpl.class);

    @Autowired
    AddressRepository addressRepository;

    @Override
    public AddressTO getAddressById(int addressid) {
        LOG.info("Get value for: " + addressid);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AddressDO addressDo = addressRepository.findByidAddress(addressid);
        AddressTO returnValue = modelMapper.map(addressDo, AddressTO.class);
        return returnValue;
    }

    @Override
    public List<AddressTO> getAddressByCustomerId(int customerid) {
        LOG.info("Obteniendo todos los address ");
        List<AddressDO> addressDo = addressRepository.findAllByuser(customerid);
        return addressDo.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<AddressTO> getAllAddress(){
        LOG.info("Getting all data");
        List<AddressDO> addressDo = (List<AddressDO>) addressRepository.findAll();
        return addressDo.stream()
                .map(this::convertToTO)
                .collect(Collectors.toList());

    }

    @Override
    public ResponseTO createAddress(AddressTO addressid) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AddressDO addressDo = modelMapper.map(addressid, AddressDO.class);
        addressRepository.save(addressDo);
        ResponseTO responseValue = new ResponseTO();
        responseValue.setCode(201);
        responseValue.setMessage("Se ha creado el usuario con identificador --> " + addressDo.getIdAddress());
        return responseValue;
    }

    @Override
    public ResponseTO updateAddress(int addressid, AddressTO address) {
        AddressDO addressDo = addressRepository.findByidAddress(addressid);
        addressDo.setDsState(address.getDsState());
        addressDo.setDsStreet(address.getDsStreet());
        addressDo.setDsNumber(address.getDsNumber());
        addressDo.setDsCP(address.getDsCP());
        addressRepository.save(addressDo);
        ResponseTO responseValue = new ResponseTO();
        responseValue.setCode(200);
        responseValue.setMessage("Se ha actualizado el usuario con identificador --> " + addressid);
        return responseValue;
    }

    @Override
    public ResponseTO deleteAddress(int idAddress, AddressTO address) {
        return null;
    }

    private AddressTO convertToTO(AddressDO address) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AddressTO addressTo = modelMapper.map(address, AddressTO.class);
        return addressTo;
    }

}
