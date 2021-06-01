package resulerturk.HRMSProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="staff_state")
public class StaffState {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="ss_id")
	private int ss_id;
	
	@Column(name="state_id")
	private int state_id;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="staff_activated")
	private boolean staff_activated;

}
