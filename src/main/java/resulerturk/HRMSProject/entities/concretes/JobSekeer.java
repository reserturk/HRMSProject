package resulerturk.HRMSProject.entities.concretes;

import java.util.Date;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name="job_sekeer_id")
@Table(name="job_sekeer")
public class JobSekeer extends Register{
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification")
	private int identification;
	
	@Column(name="birty_day")
	private Date birtyDay;
	
	/*@OneToOne(mappedBy = "job_sekeer", fetch = FetchType.LAZY)
	private Images images;*/

	@OneToOne
	private CreateCv createCv;
}
