package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.Talents;

public interface TalentsDao extends JpaRepository<Talents, Integer>{

	
	Talents getByTalentId(int talId);
}
