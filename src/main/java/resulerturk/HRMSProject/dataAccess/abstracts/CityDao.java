package resulerturk.HRMSProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import resulerturk.HRMSProject.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

	
	List<City> getByCityName(String cityName);
	
	City getByCityId(int cityId); 
}
