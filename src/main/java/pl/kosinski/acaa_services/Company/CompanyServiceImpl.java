package pl.kosinski.acaa_services.Company;

import org.springframework.stereotype.Component;
import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_model.Company.Company;

@Component
public class CompanyServiceImpl implements CompanyService {

    @Override
    public Company save(Company company) {
        return null;
    }

    @Override
    public Company get(Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    private Company daoToDto(CompanyDao companyDao) {
        return null;
    }
}
