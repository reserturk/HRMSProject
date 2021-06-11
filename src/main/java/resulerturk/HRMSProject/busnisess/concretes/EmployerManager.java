package resulerturk.HRMSProject.busnisess.concretes;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import resulerturk.HRMSProject.busnisess.abstracts.EmployerService;
import resulerturk.HRMSProject.busnisess.constans.Messages;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.ErrorResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.core.utilities.result.SuccessDataResult;
import resulerturk.HRMSProject.core.utilities.result.SuccessResult;
import resulerturk.HRMSProject.dataAccess.abstracts.EmployerDao;
import resulerturk.HRMSProject.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Şirketler  Listelendi");
	}

	@Override
	public DataResult<List<Employer>> getAllPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Şirket Eklendi");
	}

	@Override
	public DataResult<Employer> getByEmployerName(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> save(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		if(employerDao.findById(id)!=null) {
			employerDao.deleteById(id);
			return new SuccessResult(Messages.Deleted);
		}else {
			return new ErrorResult(Messages.Error);
		}
		
	}

}
