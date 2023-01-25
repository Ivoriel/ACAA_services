package pl.kosinski.acaa_services.Company;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_dao.Company.CompanyRepository;
import pl.kosinski.acaa_dto.CompanyDto;

@Component
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository repository;

    @Override
    public CompanyDto save(CompanyDao companyDao) {
        return null;
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
        dto.setClientId(companyDao.getClient());
        dto.setAddressId(companyDao.getAddressId());
        return dto;
    }
}
