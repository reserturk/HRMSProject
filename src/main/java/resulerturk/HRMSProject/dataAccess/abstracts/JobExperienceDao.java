package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {

	JobExperience getByExpeId(int expId);
	
	
}
