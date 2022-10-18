package pl.kosinski.acaa_services.Address;

import pl.kosinski.acaa_dto.AddressDto;

public interface AddressService {

    AddressDto saveAddress(AddressDto addressDto);

    AddressDto getAddress(long id);

}
