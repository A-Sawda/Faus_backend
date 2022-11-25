package com.asawda.faus.service;

import java.util.List;

import com.asawda.faus.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee e);
	Employee updateEmployee(Employee e);
	void deleteEmployee(Employee e);
	void deleteEmployeeById(Long id);
	Employee getEmployee(Long id);
	List<Employee> getAllEmployees();
	List<Employee> findByFullNameEmployeeContains(String nom);
	List<Employee> findBySexEmployeeSalaryEmployee (String sex, Double salary);
	List<Employee> findByJobIdJob(String id);
	List<Employee> findByOrderByFullNameEmployeeAsc();
	List<Employee> trierEmployeesSalaryEmployeeFullNameEmployee();

}
