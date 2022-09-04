package pl.kosinski.acaa_services.Company;

import pl.kosinski.acaa_model.Company.Company;

public interface CompanyService {

    Company save(Company company);

    Company get(Long id);

}
