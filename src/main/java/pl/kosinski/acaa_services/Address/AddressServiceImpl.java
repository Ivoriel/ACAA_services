package pl.kosinski.acaa_services.Address;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Address.AddressDao;
import pl.kosinski.acaa_dao.Address.AddressRepository;
import pl.kosinski.acaa_dto.AddressDto;

@Component
public class AddressServiceImpl implements AddressService{

    AddressRepository addressRepository;

    @Override
    public AddressDto saveAddress(AddressDto addressDto) {
        AddressDao addressDao = new AddressDao(addressDto.getId(), addressDto.getCountry(), addressDto.getMunicipality(),
                addressDto.getRegion(), addressDto.getZipCode(), addressDto.getStreet(), addressDto.getBuildingNumber(),
                addressDto.getAdditionalIdentifier());
        return addressDto;
    }

    @Override
    public AddressDto getAddress(long id) {
        return toDto(addressRepository.getAddress(id));
    }

    @Override
    public void deleteAddress(long id) {
        addressRepository.deleteAddress(id);
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
