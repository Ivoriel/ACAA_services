package pl.kosinski.acaa_services.Address;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Address.AddressDao;
import pl.kosinski.acaa_dao.Address.AddressRepository;
import pl.kosinski.acaa_dto.AddressDto;

@Component
public class AddressServiceImpl implements AddressService{

    AddressRepository addressRepository;

    @Override
    public AddressDto getAddress(long id) {
        return null;
    }

    private AddressDto toDto(AddressDao addressDao) {
        AddressDto addressDto = new AddressDto();
        addressDto.setId(addressDao.getId());
        addressDto.setCountry(addressDao.getCountry());
        addressDto.setMunicipality(addressDao.getMunicipality());
        addressDto.setRegion(addressDao.getRegion());
        addressDto.setZipCode(addressDao.getZipCode());
        addressDto.setStreet(addressDao.getStreet());
        addressDto.setBuildingNumber(addressDao.getBuildingNumber());
        addressDto.setAdditionalIdentifier(addressDao.getAdditionalIdentifier());
        return addressDto;
    }
}
