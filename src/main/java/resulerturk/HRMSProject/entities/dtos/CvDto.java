package resulerturk.HRMSProject.entities.dtos;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	
	private int cvId;
	private String coverLetter;
	private ZonedDateTime beginTime;
	private int jobSekeerId;
	private int schoolId;
	private int jobExperienceId;
	private int languageId;
	private int socialMediaId;
	private int talentsId;
	private int imageId;

}
