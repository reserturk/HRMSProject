package resulerturk.HRMSProject.dataAccess.abstracts;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import resulerturk.HRMSProject.entities.concretes.AddJob;
import resulerturk.HRMSProject.entities.dtos.AddJobWithCityNameDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithEmployerActiveDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithJobPositionName;

public interface AddJobDao extends JpaRepository<AddJob, Integer> {

	
	AddJob getByAddJobId(int id);
	
	AddJob getByJobDescription(String description);
	
	List<AddJob> getByActivedJobTrueAndEmployer_RegisterIdIs(int id);
	
	List<AddJob> getByActivedJobTrue();
	
	List<AddJob> getByJobCreateTimeAndActivedJob(LocalDate createTime, boolean actived);

	@Query("Select new resulerturk.HRMSProject.entities.dtos.AddJobWithEmployerActiveDto(a.addJobId,e.companyName,a.activedJob) from Employer e Inner Join e.addJobs a")
	List<AddJobWithEmployerActiveDto> getAddJobEmployerIdWithActived();
	
	@Query("Select new resulerturk.HRMSProject.entities.dtos.AddJobWithJobPositionName(a.addJobId,j.positionName) from JobPosition j Inner Join j.addJob a")
	List<AddJobWithJobPositionName> getAddJobWithPositionName();
	
	@Query("Select new resulerturk.HRMSProject.entities.dtos.AddJobWithCityNameDto(a.addJobId,c.cityName) from City c Inner Join c.addJob a")
	List<AddJobWithCityNameDto> getAddJobWithCityName();
}
