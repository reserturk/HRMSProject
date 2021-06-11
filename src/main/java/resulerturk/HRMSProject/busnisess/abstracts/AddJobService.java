package resulerturk.HRMSProject.busnisess.abstracts;


import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.AddJob;
import resulerturk.HRMSProject.entities.dtos.AddJobWithCityNameDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithEmployerActiveDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithJobPositionName;


public interface AddJobService {
	
	
	DataResult<List<AddJob>> getAll();
	DataResult<List<AddJob>> getAllSorted();
	DataResult<List<AddJob>> getAll(int pageNo,int pageSize);
	Result add(AddJob addJob);

	DataResult<List<AddJob>> getByActivedJobTrueAndEmployer_RegisterIdIs(int id);
	
	DataResult<AddJob> getByJobDescription(String description);
	
	DataResult<List<AddJob>> getByActivedJobTrue(boolean active);
	
	DataResult<List<AddJob>> getByJobCreateTimeAndActivedJob(ZonedDateTime createTime, boolean actived);
	
	DataResult<List<AddJobWithEmployerActiveDto>> getAddJobEmployerIdWithActived();

	DataResult<List<AddJobWithJobPositionName>> getAddJobWithPositionName();
	
	DataResult<List<AddJobWithCityNameDto>> getAddJobWithCityName();
}
