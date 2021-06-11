package resulerturk.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import resulerturk.HRMSProject.busnisess.abstracts.AddJobService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.AddJob;
import resulerturk.HRMSProject.entities.dtos.AddJobWithCityNameDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithEmployerActiveDto;
import resulerturk.HRMSProject.entities.dtos.AddJobWithJobPositionName;



@RestController
@RequestMapping("/api/addesjobs")
public class AddJobControllers {
	
	private AddJobService addJobService;

	@Autowired
	public AddJobControllers(AddJobService addJobService) {
		super();
		this.addJobService = addJobService;
	}
	
	@GetMapping("/addjob")
	public DataResult<List<AddJob>> getAll(){
		return this.addJobService.getAll();
	}
	
	@PostMapping("/addjobadded")
	public Result add(@RequestBody AddJob addJob) {
		return  this.addJobService.add(addJob);
	}
	
	@GetMapping("/getAddJobEmployerIdWithActived")
	public DataResult<List<AddJobWithEmployerActiveDto>> getAddJobEmployerIdWithActived() {
		return  this.addJobService.getAddJobEmployerIdWithActived();
	}
	
	@GetMapping("/getAddJobWithPositionName")
	public DataResult<List<AddJobWithJobPositionName>> getAddJobWithPositionName() {
		return  this.addJobService.getAddJobWithPositionName();
	}
	
	@GetMapping("/getAddJobWithCityName")
	public DataResult<List<AddJobWithCityNameDto>> getAddJobWithCityName() {
		return  this.addJobService.getAddJobWithCityName();
	}

	@PostMapping("/getByActivedJobTrueAndEmployer_RegisterIdIs")
	public DataResult<List<AddJob>> getByActivedJobTrueAndEmployer_RegisterIdIs(@RequestParam int id){
		return this.addJobService.getByActivedJobTrueAndEmployer_RegisterIdIs(id);
	}
}
