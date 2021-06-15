package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.SocialMediaAddress;

public interface SocialMediaDao extends JpaRepository<SocialMediaAddress, Integer>{

	
	SocialMediaAddress getBySmaId(int smaId);
}
