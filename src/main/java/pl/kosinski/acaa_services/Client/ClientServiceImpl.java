package pl.kosinski.acaa_services.Client;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Client.ClientDao;
import pl.kosinski.acaa_dao.Client.ClientRepository;
import pl.kosinski.acaa_dto.ClientDto;

import java.util.Optional;

@Component
public class ClientServiceImpl implements ClientService {

    ClientRepository clientRepository;

    @Override
    public ClientDto save(ClientDao clientDao) {
        return null;
    }

    @Override
    public ClientDto get(Long id) {
        ClientDto dto = new ClientDto();
        Optional<ClientDao> daoOptional = clientRepository.get(id);
        if (Optional.ofNullable(daoOptional).isPresent()) {
            dto = toDto(daoOptional.get());
        }
        return dto;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    private ClientDto toDto(ClientDao clientDao) {
        ClientDto dto = new ClientDto();
        dto.setId(clientDao.getId());
        dto.setName(clientDao.getName());
        dto.setAddress(clientDao.getAddressId());
        return dto;
    }

}
