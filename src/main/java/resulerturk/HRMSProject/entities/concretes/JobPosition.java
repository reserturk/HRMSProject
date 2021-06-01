package resulerturk.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_position")
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="position_id")
	private int positionId;
	
	@Column(name="position_name")
	private String positionName;



}
