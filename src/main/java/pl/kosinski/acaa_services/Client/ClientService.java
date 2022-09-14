package pl.kosinski.acaa_services.Client;

import pl.kosinski.acaa_model.Client.Client;

public interface ClientService {

    Client save(Client client);

    Client get(Long id);

    boolean delete(Long id);

}
