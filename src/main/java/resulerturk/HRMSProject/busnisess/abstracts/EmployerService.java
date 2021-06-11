package resulerturk.HRMSProject.busnisess.abstracts;

import java.util.List;

import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.Employer;

public interface EmployerService {

	DataResult<Employer> save(Employer employer);
	
	Result delete(int id);
	DataResult<List<Employer>> getAll();
	DataResult<List<Employer>> getAllPage(int pageNo,int pageSize);
	
	Result add(Employer employer);
	
	DataResult<Employer> getByEmployerName(Employer employer);
}
