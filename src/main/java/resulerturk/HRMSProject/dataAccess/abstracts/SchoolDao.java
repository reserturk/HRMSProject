package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.School;

public interface SchoolDao  extends JpaRepository<School, Integer>{

	
	School getByScId(int scId);
}
