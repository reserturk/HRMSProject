package resulerturk.HRMSProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.Images;

public interface ImagesDao extends JpaRepository<Images, Integer> {

}
