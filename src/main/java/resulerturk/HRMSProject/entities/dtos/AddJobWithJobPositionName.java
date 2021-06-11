package resulerturk.HRMSProject.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddJobWithJobPositionName {

	private int addJobId;
	private String positionName;
}
