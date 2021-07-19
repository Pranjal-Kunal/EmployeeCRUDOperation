
package com.ascent.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascent.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Optional<Employee> findEmployeeById(int id);


}
