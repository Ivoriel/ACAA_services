package pl.kosinski.acaa_services.Company;

import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_model.Company.Company;

public interface CompanyService {

    Company save(CompanyDao companyDao);

    Company get(Long id);

    boolean delete(Long id);

}
