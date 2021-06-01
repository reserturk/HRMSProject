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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="email_active_code")
public class EmailActiveCode {
	
	
	@Id
	@GeneratedValue
	@Column(name="active_id")
	private int active_id;
	
	@Column(name="register_id")
	private int register_id;
	
	@Column(name="active_code")
	private String active_code;

}
