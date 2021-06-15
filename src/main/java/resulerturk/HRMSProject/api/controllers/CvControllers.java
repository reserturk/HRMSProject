package resulerturk.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resulerturk.HRMSProject.busnisess.abstracts.CvService;
import resulerturk.HRMSProject.core.utilities.result.DataResult;
import resulerturk.HRMSProject.core.utilities.result.Result;
import resulerturk.HRMSProject.entities.concretes.CreateCv;

@RestController
@RequestMapping("/api/cv")
public class CvControllers {

	
	private CvService cvService;

	@Autowired
	public CvControllers(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CreateCv>> getAll(){
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CreateCv createCv) {
		return this.cvService.add(createCv);
	}
	
}
