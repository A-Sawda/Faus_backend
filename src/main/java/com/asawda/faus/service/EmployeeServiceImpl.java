package com.asawda.faus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asawda.faus.model.Employee;
import com.asawda.faus.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		employeeRepository.delete(e);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByFullNameEmployeeContains(String nom) {
		return employeeRepository.findByFullNameEmployeeContains(nom);
	}

	@Override
	public List<Employee> findBySexEmployeeSalaryEmployee(String sex, Double salary) {
		return employeeRepository.findBySexEmployeeSalaryEmployee(sex, salary);
	}

	@Override
	public List<Employee> findByJobIdJob(String id) {
		return employeeRepository.findByJobIdJob(id);
	}

	@Override
	public List<Employee> findByOrderByFullNameEmployeeAsc() {
		return employeeRepository.findByOrderByFullNameEmployeeAsc();
	}

	@Override
	public List<Employee> trierEmployeesSalaryEmployeeFullNameEmployee() {
		return employeeRepository.trierEmployeesSalaryEmployeeFullNameEmployee();
	}
	
	

}
