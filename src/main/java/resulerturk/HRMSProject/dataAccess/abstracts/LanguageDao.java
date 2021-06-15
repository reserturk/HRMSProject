package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {

	Language getByLanId(int lanId);
}
