package resulerturk.HRMSProject.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="add_job")
public class AddJob {
	
	//iş ekleme 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="add_job_id")
	private int addJobId;
	

	@Column(name="job_description")
	private String jobDescription;
	

	@Column(name="job_min_salary")
	private double jobMinSalary;
	
	@Column(name="job_max_salary")
	private double jobMaxSalary;
	
	@Column(name="job_number")
	private int jobNumber;
	
	@Column(name="job_create_time")
	private LocalDate jobCreateTime;
	
	@Column(name="job_dead_line")
	private LocalDate jobDeadLine;
	
	@Column(name="actived_job")
	private boolean activedJob;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="position_id")
	private JobPosition jobPosition;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="city_id")
	private City city;
	
	
}
