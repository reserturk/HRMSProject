package resulerturk.HRMSProject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddJobWithCityNameDto {

	private int addJobId;
	private String cityName;
}
