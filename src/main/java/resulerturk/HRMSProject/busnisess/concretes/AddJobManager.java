package resulerturk.HRMSProject.busnisess.concretes;


import java.time.ZonedDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resulerturk.HRMSProject.busnisess.abstracts.AddJobService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.core.utilities.result.SuccessDataResult;
import resulerturk.HRMSProject.core.utilities.result.SuccessResult;
import resulerturk.HRMSProject.dataAccess.abstracts.AddJobDao;
import resulerturk.HRMSProject.entities.concretes.AddJob;
import resulerturk.HRMSProject.entities.dtos.AddJobWithCityNameDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithEmployerActiveDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithJobPositionName;

@Service
public class AddJobManager implements AddJobService{
	
	private AddJobDao addJobDao;
	

	@Autowired
	public AddJobManager(AddJobDao addJobDao) {
		super();
		this.addJobDao = addJobDao;
	}



	@Override
	public DataResult<List<AddJob>> getAll() {
		return new SuccessDataResult<List<AddJob>>(this.addJobDao.findAll(),"Data Listelendi.");
	}

	@Override
	public DataResult<List<AddJob>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AddJob>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(AddJob addJob) {
		this.addJobDao.save(addJob);
		return new SuccessResult("Ürün eklendi.");
	}

	@Override
	public DataResult<AddJob> getByJobDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AddJob>> getByActivedJobTrue(boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AddJob>> getByJobCreateTimeAndActivedJob(ZonedDateTime createTime, boolean actived) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<AddJobWithEmployerActiveDto>> getAddJobEmployerIdWithActived() {
		return new SuccessDataResult<List<AddJobWithEmployerActiveDto>>
		(this.addJobDao.getAddJobEmployerIdWithActived(),"Şirket ismi ve aktif iş ilanları getirildi.");
	}

	@Override
	public DataResult<List<AddJobWithJobPositionName>> getAddJobWithPositionName() {
		return new SuccessDataResult<List<AddJobWithJobPositionName>>
		(this.addJobDao.getAddJobWithPositionName(),"Pozisyon ismi getirildi.");
	}

	@Override
	public DataResult<List<AddJobWithCityNameDto>> getAddJobWithCityName() {
		return new SuccessDataResult<List<AddJobWithCityNameDto>>
		(this.addJobDao.getAddJobWithCityName(),"City Getirildi.");
	}



	@Override
	public DataResult<List<AddJob>> getByActivedJobTrueAndEmployer_RegisterIdIs(int id) {
		return new SuccessDataResult<List<AddJob>>
		(this.addJobDao.getByActivedJobTrueAndEmployer_RegisterIdIs(id));
			
		
	}

}
