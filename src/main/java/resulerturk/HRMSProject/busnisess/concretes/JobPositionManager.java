package resulerturk.HRMSProject.busnisess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resulerturk.HRMSProject.busnisess.abstracts.JobPositionService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.core.utilities.result.SuccessDataResult;
import resulerturk.HRMSProject.core.utilities.result.SuccessResult;
import resulerturk.HRMSProject.dataAccess.abstracts.JobPositionDao;
import resulerturk.HRMSProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"data listelendi");
	}


	@Override
	public DataResult<List<JobPosition>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Ürün eklendi");
	}

	@Override
	public DataResult<JobPosition> getByJobPositionName(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
