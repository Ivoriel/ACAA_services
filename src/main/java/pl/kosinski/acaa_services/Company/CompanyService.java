package pl.kosinski.acaa_services.Company;

import pl.kosinski.acaa_dao.Company.CompanyDao;
import pl.kosinski.acaa_dto.CompanyDto;

public interface CompanyService {

    CompanyDto save(CompanyDto companyDto);

    CompanyDto get(Long id);

    void delete(Long id);

}
