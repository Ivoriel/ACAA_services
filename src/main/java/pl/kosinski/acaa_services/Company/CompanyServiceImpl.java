package pl.kosinski.acaa_services.Company;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_dto.CompanyDto;
import pl.kosinski.acaa_model.Company.Company;

@Component
public class CompanyServiceImpl implements CompanyService {

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
        return null;
    }
}
