package vtech.Springemprestapi.services;

import java.util.List;

import vtech.Springemprestapi.models.Employee;

public interface EmployeeServices {
	
	List<Employee> getAllEmployee(); // interface alwyas contain abstarct method

	Employee SaveEmployee(Employee employee);

	void deleteEmployee(Long id);

	Employee updateEmployee(Long id, Employee employee);
	
}
