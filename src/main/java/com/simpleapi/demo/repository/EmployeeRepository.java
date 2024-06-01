package com.simpleapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpleapi.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
