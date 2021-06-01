package resulerturk.HRMSProject.busnisess.abstracts;

import java.util.List;


import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>>  getAll();
	DataResult<List<JobPosition>>  getAll(int pageNo, int pageSize);
	Result add(JobPosition jobPosition);

	DataResult<JobPosition> getByJobPositionName(JobPosition jobPosition);
}
