package pl.kosinski.acaa_services.Client;

import pl.kosinski.acaa_dto.ClientDto;

public interface ClientService {

    pl.kosinski.acaa_dto.ClientDto save(ClientDto clientDto);

    pl.kosinski.acaa_dto.ClientDto get(Long id);

    void delete(Long id);

}
