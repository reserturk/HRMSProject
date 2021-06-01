package resulerturk.HRMSProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_sekeer")
public class JobSekeer {
	
	@Id
	@Column(name="register_id")
	private int registerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification")
	private int identification;
	
	@Column(name="birty_day")
	private Date birtyDay;
	


}
