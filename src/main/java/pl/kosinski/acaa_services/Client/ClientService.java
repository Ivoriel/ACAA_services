package pl.kosinski.acaa_services.Client;

import pl.kosinski.acaa_dao.Client.ClientDao;
import pl.kosinski.acaa_dto.ClientDto;
import pl.kosinski.acaa_model.Client.Client;

public interface ClientService {

    ClientDto save(ClientDao clientDao);

    ClientDto get(Long id);

    void delete(Long id);

}
