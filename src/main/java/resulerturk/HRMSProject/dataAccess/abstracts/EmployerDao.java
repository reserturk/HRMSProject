package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	
	Employer getByRegisterId(int id);
	Employer getByCompanyName(String companyName);
}