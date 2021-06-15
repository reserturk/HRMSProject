package resulerturk.HRMSProject.entities.concretes;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name="create_cv")
public class CreateCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;
	
	@Column(name="cv_cover_letter")
	private String coverLetter;
	
	@Column(name="cv_begin_time")
	private LocalDate beginTime;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
    @JoinColumn(name = "jobsekeer_id" ,referencedColumnName = "job_sekeer_id")
    private JobSekeer jobSekeer;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="school_id")
	private School school;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="expe_id")
	private JobExperience jobExperience;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="lan_id")
	private Language language;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="sma_id")
	private SocialMediaAddress socialMediaAddress;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="talent_id")
	private Talents talents;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="image_id")
	private Images images;
}
