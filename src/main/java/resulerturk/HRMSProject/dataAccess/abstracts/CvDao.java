package resulerturk.HRMSProject.dataAccess.abstracts;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.CreateCv;

public interface CvDao extends JpaRepository<CreateCv, Integer>{
	
	CreateCv getByCvId(int cvId);
	
	CreateCv getByCoverLetter(String cvCoverLetter);
	
	CreateCv getByBeginTime(LocalDate cvBeginTime);
	
//	List<CreateCv> getByCreateCvIdAndJobSekeer_RegisterId(int cvId,int jobSekeerId);
	
	//List<CreateCv> getByCreateCvIdAndJobExperience_ExpeId(int cvId,int expeId);
	
	//List<CreateCv> getByCreateCvIdAndLanguage_LanId(int cvId,int lanId);
	
//	List<CreateCv> getByCreateCvIdAndSocialMediaAddress_SmaId(int cvId,int smaId);
	
	//List<CreateCv> getByCreateCvIdAndTalents_TalentId(int cvId,int talentId);
	
	//List<CreateCv> getByCreateCvIdAndSchool_ScId(int cvId,int scId);
}
