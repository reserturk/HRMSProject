package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import resulerturk.HRMSProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	
	JobPosition getByPositionId(int id);
	JobPosition getByPositionName(String positionName);

	
}
