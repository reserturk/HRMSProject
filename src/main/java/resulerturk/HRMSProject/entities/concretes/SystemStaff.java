package resulerturk.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_staff")
public class SystemStaff {
	
	@Id
	@GeneratedValue
	@Column(name="sys_staff_id")
	private int sysStaffId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;


	public SystemStaff(int sysStaffId, String firstName, String lastName) {
		super();
		this.sysStaffId = sysStaffId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public SystemStaff() {
		super();
	}

}
