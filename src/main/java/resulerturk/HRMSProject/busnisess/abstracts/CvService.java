package resulerturk.HRMSProject.busnisess.abstracts;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import java.util.List;


import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.CreateCv;

public interface CvService {

	Result add(CreateCv createCv);
	
	DataResult<List<CreateCv>> getAll();
	DataResult<List<CreateCv>> getAllSorted();
	
    DataResult<List<CreateCv>> getAll(int pageNo, int pageSize);
	
    DataResult<CreateCv>  getBygetByCvId(int cvId);
	
    DataResult<CreateCv>  getByCoverLetter(String cvCoverLetter);
	
    DataResult<CreateCv>  getByBeginTime(LocalDate cvBeginTime);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndJobRegisterId(int cvId,int jobSekeerId);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndJobExperienceId(int cvId,int expeId);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndLanguageId(int cvId,int lanId);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndSocialMediaAddressSmaId(int cvId,int smaId);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndTalentsId(int cvId,int talentId);
	
	DataResult<List<CreateCv>>  getByCreateCvIdAndSchoolScId(int cvId,int scId);
}
