package pl.kosinski.acaa_services.Client;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Client.ClientDao;
import pl.kosinski.acaa_model.Client.Client;

@Component
public class ClientServiceImpl implements ClientService {

    @Override
    public Client save(ClientDao clientDao) {
        return null;
    }

    @Override
    public Client get(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    private Client toDto(ClientDao clientDao) {
        return null;
    }

}
