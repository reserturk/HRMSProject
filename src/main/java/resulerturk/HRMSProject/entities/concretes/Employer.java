package resulerturk.HRMSProject.entities.concretes;

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
@Table(name="employer")
public class Employer {
	
	@Id
	@Column(name="register_id")
	private int registerId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="email_activated")
	private boolean emailActivated;


	
	
	

}
