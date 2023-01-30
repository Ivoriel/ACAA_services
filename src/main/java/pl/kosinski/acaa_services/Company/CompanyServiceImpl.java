package pl.kosinski.acaa_services.Company;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_dao.Company.CompanyRepository;
import pl.kosinski.acaa_dto.CompanyDto;

import java.util.Optional;

@Component
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository repository;

    @Override
    public CompanyDto save(CompanyDao companyDao) {
        Optional<CompanyDao> addressDaoOptional = repository.get(companyDao.getId());
        if (Optional.ofNullable(addressDaoOptional).isPresent()) {
            return toDto(addressDaoOptional.get().edit(companyDao.getName(), companyDao.getClientId(),
                    companyDao.getAddressId()));
        } else {
            return toDto(new CompanyDao(repository.size(), companyDao.getName(), companyDao.getClientId(),
                    companyDao.getAddressId()));
        }
    }

    @Override
    public CompanyDto get(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    private CompanyDto toDto(CompanyDao companyDao) {
        CompanyDto dto = new CompanyDto();
        dto.setId(companyDao.getId());
        dto.setName(companyDao.getName());
        dto.setClientId(companyDao.getClientId());
        dto.setAddressId(companyDao.getAddressId());
        return dto;
    }
}
