package pl.kosinski.acaa_services.Client;

import pl.kosinski.acaa_dao.Client.ClientDao;
import pl.kosinski.acaa_model.Client.Client;

public interface ClientService {

    Client save(ClientDao clientDao);

    Client get(Long id);

    boolean delete(Long id);

}
