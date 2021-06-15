package resulerturk.HRMSProject.entities.concretes;

import java.time.LocalDate;
import java.time.ZonedDateTime;
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
@Table(name="school")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_id")
	private int scId;
	
	@Column(name="school_name")
	private String scName;
	
	@Column(name="school_department_name")
	private String scDepartmentName;
	
	@Column(name="school_begin_date")
	private LocalDate scBeginDate;
	
	@Column(name="school_graduated_year")
	private int scGraduatedYear;
	
	@Column(name="school_graduated_info")
	private String scGraduatedInfo;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "school")
	private List<CreateCv> createCv;
}
