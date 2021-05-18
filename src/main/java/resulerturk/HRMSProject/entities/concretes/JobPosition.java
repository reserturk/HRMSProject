package resulerturk.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@Table(name="job_position")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int position_id;
	
	@Column(name="position_name")
	private String position_name;

	public JobPosition(int position_id, String position_name) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
	}

	public JobPosition() {
		super();
	}

}
