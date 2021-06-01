package resulerturk.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="email_state")
public class EmailState {
	
	@Id
	@GeneratedValue
	@Column(name="state_id")
	private int state_id;
	
	@Column(name="active_id")
	private int active_id;
	
	@Column(name="status")
	private boolean status;

}
