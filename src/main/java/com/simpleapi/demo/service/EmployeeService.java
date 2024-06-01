package com.simpleapi.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleapi.demo.repository.EmployeeRepository;
import com.simpleapi.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public List<Employee> getEmployees() {
		return repo.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return repo.findById(id);
	}

	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
}
