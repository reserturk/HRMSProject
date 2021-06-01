package resulerturk.HRMSProject.busnisess.abstracts;

import java.util.List;

import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.JobSekeer;

public interface JobSekeerService {
	DataResult<List<JobSekeer>> getAll();
	DataResult<List<JobSekeer>> getAll(int pageNo,int pageSize);
	
	Result add(JobSekeer jobSekeer);
	
	DataResult<JobSekeer> getByJobSekeerName(JobSekeer jobSekeer);

}
