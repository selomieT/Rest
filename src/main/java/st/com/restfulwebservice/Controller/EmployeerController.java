package st.com.restfulwebservice.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import st.com.restfulwebservice.Model.CommonResponse;
import st.com.restfulwebservice.Model.Employeer;
import st.com.restfulwebservice.Model.StatusObject;
import st.com.restfulwebservice.Service.EmployeerService;

@RestController
public class EmployeerController {
	private Logger logger = LoggerFactory.getLogger(EmployeerController.class);
	@Autowired
	EmployeerService employeerService;

	@GetMapping("/employers")
	public ResponseEntity<CommonResponse> getEmployee() {
		logger.info("Getting Ready to print List Of Employeers");
		List<Employeer> employeers = employeerService.getEmployeers();
		CommonResponse commonResponse = new CommonResponse();
		StatusObject object = new StatusObject();
		commonResponse.setResponseData(employeers);
		commonResponse.setStatusObj(object);
		ResponseEntity<CommonResponse> response = new ResponseEntity<>(commonResponse, HttpStatus.OK);
		return response;
	}

	@GetMapping("/employers/{name}")
	public Employeer getEmployee(@PathVariable("name") String name) {
		return employeerService.getEmployer(name);
	}

	@PostMapping("/employers")
	public void createEmployee(@RequestBody Employeer employeer) {
		employeerService.createEmployee(employeer);
	}

	@DeleteMapping("/employeers/{name}")
	public void deleteEmployee(@PathVariable("name") String name) {
		employeerService.deleteEmployee(name);
	}

}
