package resulerturk.HRMSProject.busnisess.abstracts;

import java.util.List;

import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.Employer;

public interface EmployerService {

	
	DataResult<List<Employer>> getAll();
	DataResult<List<Employer>> getAll(int pageNo,int pageSize);
	
	Result add(Employer employer);
	
	DataResult<Employer> getByEmployerName(Employer employer);
}
