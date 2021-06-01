package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import resulerturk.HRMSProject.entities.concretes.JobSekeer;

public interface JobSekeerDao extends JpaRepository<JobSekeer,Integer>{

	JobSekeer getByFirstName(String firstName);
}
