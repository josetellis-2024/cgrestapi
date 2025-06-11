package vtech.Springemprestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vtech.Springemprestapi.Repository.EmployeeRepository;
import vtech.Springemprestapi.models.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeServices {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}

	@Override
	public Employee SaveEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee emp=empRepo.findById(id).orElse(null);
		emp.setEmpFirstName(employee.getEmpFirstName());
		emp.setEmpLastName(employee.getEmpLastName());
		emp.setEmpemail(employee.getEmpemail());
		emp.setEmpImg(employee.getEmpImg());
		emp.setEmpRole(employee.getEmpRole());
		
		empRepo.save(emp);
		return emp;
	}

}
