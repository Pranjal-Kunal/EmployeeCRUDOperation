package com.ascent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascent.model.Employee;
import com.ascent.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	
	
//	public EmployeeRepository getEmployeeRepository() {
//		return employeeRepository;
//	}

	
//	public EmployeeService(EmployeeRepository employeeRepository) {
//		this.employeeRepository = employeeRepository;
//	}

//	public Employee addEmployee(Employee employee) {
//		int id = employee.getId() + 1;
//		employee.setId(id);
//		return employee;
//	}
	
	public boolean addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return true;
	}

	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		 employeeRepository.findEmployeeById(employee.getId());
		 return employeeRepository.save(employee);
	
	}

	public Employee findEmployeeById(int id) {
		return employeeRepository.findEmployeeById(id).orElseThrow(() -> new RuntimeException("Employee Not Found for the entered id !!!"));
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
