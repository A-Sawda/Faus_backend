package com.asawda.faus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asawda.faus.model.Employee;
import com.asawda.faus.service.EmployeeService;

@RestController
@RequestMapping("/api") // pour accéder aux méthodes : localhost:8080/faus/api
@CrossOrigin
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
	}
	
	@RequestMapping(value="/jobemployees/{id}",method = RequestMethod.GET)
	public List<Employee> getJobEmployees(@PathVariable("id") String id) {
		return employeeService.findByJobIdJob(id);
	}
}
