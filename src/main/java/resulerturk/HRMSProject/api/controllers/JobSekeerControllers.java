package resulerturk.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resulerturk.HRMSProject.busnisess.abstracts.JobSekeerService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.JobSekeer;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSekeerControllers {
	
	private JobSekeerService jobSekeerService;

	
	
	@Autowired
	public JobSekeerControllers(JobSekeerService jobSekeerService) {
		super();
		this.jobSekeerService = jobSekeerService;
	}

	@GetMapping("/jobsekeergetall")
	public DataResult<List<JobSekeer>> getAll(){
		return this.jobSekeerService.getAll();
	}
	
	@PostMapping("/jobsekeeradd")
	public Result add(@RequestBody JobSekeer jobSekeer) {
		return  this.jobSekeerService.add(jobSekeer);
	}

}
