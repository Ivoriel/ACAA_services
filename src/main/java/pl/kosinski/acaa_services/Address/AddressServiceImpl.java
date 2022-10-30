package pl.kosinski.acaa_services.Address;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Address.AddressDao;
import pl.kosinski.acaa_dao.Address.AddressRepository;
import pl.kosinski.acaa_dto.AddressDto;

import java.util.Optional;

@Component
public class AddressServiceImpl implements AddressService{

    AddressRepository addressRepository;

    @Override
    public AddressDto save(AddressDto addressDto) {
        AddressDao addressDao = new AddressDao(addressDto.getId(), addressDto.getCountry(), addressDto.getMunicipality(),
                addressDto.getRegion(), addressDto.getZipCode(), addressDto.getStreet(), addressDto.getBuildingNumber(),
                addressDto.getAdditionalIdentifier());
        return addressDto;
    }

    @Override
    public AddressDto get(long id) {
        AddressDto addressDto = new AddressDto();
        Optional<AddressDao> addressDaoOptional = addressRepository.getAddress(id);
        if (Optional.ofNullable(addressDaoOptional).isPresent()) {
            addressDto = toDto(addressDaoOptional.get());
        }
        return addressDto;
    }

    @Override
    public void delete(long id) {
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
