package vtech.Springemprestapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vtech.Springemprestapi.models.Employee;
import vtech.Springemprestapi.services.EmployeeServiceImplementation;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImplementation empService;
	
	@GetMapping("/show")
	public List<Employee>getAllEmployees(){
		return empService.getAllEmployee();
	}
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empService.SaveEmployee(employee);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		empService.deleteEmployee(id);
	}
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee) {
		return empService.updateEmployee(id, employee);
	}

}
