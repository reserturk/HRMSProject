package resulerturk.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@Table(name="job_experience")
public class JobExperience {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="expe_id")
	private int expeId;
	
	@Column(name="expe_company_name")
	private String expeCompanyName;
	
	@Column(name="expe_job_position")
	private String expeJobPosition;
	
	@Column(name="expe_work_status")
	private String expeWorkingStatus;
	
	@Column(name="expe_begin_year")
	private int expeBeginYear;
	
	@Column(name="expe_end_year")
	private int expeEndYear;
	
	@Column(name="expe_info")
	private String expeInfo;
	
	@OneToMany(mappedBy = "jobExperience")
	private List<CreateCv> createCv;
}
