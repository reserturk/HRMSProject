package resulerturk.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import resulerturk.HRMSProject.busnisess.abstracts.EmployerService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerControllers {
	
	private EmployerService employerService;

	@Autowired
	public EmployerControllers(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/employergetall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/employeradd")
	public Result add(@RequestBody Employer employer) {
		return  this.employerService.add(employer);
	}

}
