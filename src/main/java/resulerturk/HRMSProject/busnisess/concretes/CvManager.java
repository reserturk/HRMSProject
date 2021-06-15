package resulerturk.HRMSProject.busnisess.concretes;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resulerturk.HRMSProject.busnisess.abstracts.CvService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.core.utilities.result.SuccessDataResult;
import resulerturk.HRMSProject.core.utilities.result.SuccessResult;
import resulerturk.HRMSProject.dataAccess.abstracts.CvDao;
import resulerturk.HRMSProject.entities.concretes.CreateCv;

@Service
public class CvManager implements CvService{
	
	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public Result add(CreateCv createCv) {
		this.cvDao.save(createCv);
		return new SuccessResult("ürün eklendi");
	}

	@Override
	public DataResult<List<CreateCv>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndJobRegisterId(int cvId, int jobSekeerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndJobExperienceId(int cvId, int expeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndLanguageId(int cvId, int lanId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndSocialMediaAddressSmaId(int cvId, int smaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndTalentsId(int cvId, int talentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getByCreateCvIdAndSchoolScId(int cvId, int scId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CreateCv>> getAll() {
		return new SuccessDataResult<List<CreateCv>>(this.cvDao.findAll(),"Data Listelendi.");
	}

	@Override
	public DataResult<CreateCv> getBygetByCvId(int cvId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CreateCv> getByCoverLetter(String cvCoverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CreateCv> getByBeginTime(LocalDate cvBeginTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
