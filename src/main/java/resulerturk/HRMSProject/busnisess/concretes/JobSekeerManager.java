package resulerturk.HRMSProject.busnisess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resulerturk.HRMSProject.busnisess.abstracts.JobSekeerService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.core.utilities.result.SuccessDataResult;
import resulerturk.HRMSProject.dataAccess.abstracts.JobSekeerDao;
import resulerturk.HRMSProject.entities.concretes.Employer;
import resulerturk.HRMSProject.entities.concretes.JobSekeer;

@Service
public class JobSekeerManager implements JobSekeerService{

	private JobSekeerDao jobSekeerDao;
	

	@Autowired
	public JobSekeerManager(JobSekeerDao jobSekeerDao) {
		super();
		this.jobSekeerDao = jobSekeerDao;
	}

	@Override
	public DataResult<List<JobSekeer>> getAll() {
		return new SuccessDataResult<List<JobSekeer>>(this.jobSekeerDao.findAll(),"İş Arayanlar Listelendi");
	}

	@Override
	public DataResult<List<JobSekeer>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobSekeer jobSekeer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSekeer> getByJobSekeerName(JobSekeer jobSekeer) {
		// TODO Auto-generated method stub
		return null;
	}

}
