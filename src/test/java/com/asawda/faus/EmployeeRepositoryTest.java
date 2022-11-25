package com.asawda.faus;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.asawda.faus.model.Employee;
import com.asawda.faus.model.Job;
import com.asawda.faus.repository.EmployeeRepository;

@SpringBootTest
public class EmployeeRepositoryTest {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	public void testCreateEmployee() {
		Job job = new Job("DG", "Haut Cadre", 500000.0, 800000.0);
		Employee employee = new Employee("FEMININ", LocalDate.of( 1997 , 05 , 12 ), "Sawda", "Abdoulaye", "Sawda Abdoulaye", 500000.0, LocalDate.now(), job);
		employeeRepository.save(employee);

		Job job1 = new Job("COACH", "Cadre", 100000.0, 200000.0);
		Employee employee1 = new Employee("MASCULIN", LocalDate.of( 1994 , 05 , 12 ), "Imran", "Ibrahim", "Imran Ibrahim", 100000.0, LocalDate.now(), job1);
		employeeRepository.save(employee1);
		

		Job job2 = new Job("COACH", "Cadre", 100000.0, 200000.0);
		Employee employee2 = new Employee("FEMININ", LocalDate.of( 2000 , 05 , 12 ), "Yousra", "Sadou", "Yousra Sadou", 100000.0, LocalDate.now(), job2);
		employeeRepository.save(employee2);
		

		Job job3 = new Job("GARDIEN", "Non Cadre", 50000.0, 70000.0);
		Employee employee3 = new Employee("MASCULIN", LocalDate.of( 1998 , 05 , 12 ), "Ismael", "Moussa", "Ismael Moussa", 50000.0, LocalDate.now(), job3);
		employeeRepository.save(employee3);
	}
	
	@Test
	public void testFindEmployee() {
		Employee employee = employeeRepository.findById(1L).get();
		System.out.println(employee);
		/*List<Employee> employees = employeeRepository.findByFullNameEmployeeContains("Sawda");
		for (Employee employee : employees) {
			System.out.println(employee);
		}*/
	}
	
	@Test
	public void testFindAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	@Test
	public void testUpdateEmployee() {
		Employee employee = employeeRepository.findById(3L).get();
		employee.setBrithdayEmployee(LocalDate.of( 2000 , 12 , 05 ));
		employeeRepository.save(employee);
		System.out.println(employee);
	}
	
	@Test
	 public void testDeleteEmployee(){
		employeeRepository.deleteById(4L);
	}
	
	@Test
	public void testFindByFullNameEmployeeContains(){
		List<Employee> employees = employeeRepository.findByFullNameEmployeeContains("i");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	@Test
	public void testFindBySexEmployeeSalaryEmployee(){
		List<Employee> employees = employeeRepository.findBySexEmployeeSalaryEmployee("MASCULIN",100000.0);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	@Test
	public void testFindByJobIdJob(){
		List<Employee> employees = employeeRepository.findByJobIdJob("COACH");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	@Test
	public void testTrierEmployeesSalaryEmployeeFullNameEmployee(){
		List<Employee> employees = employeeRepository.trierEmployeesSalaryEmployeeFullNameEmployee();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	@Test
	public void testFindByOrderByFullNameEmployeeAsc(){
		List<Employee> employees = employeeRepository.findByOrderByFullNameEmployeeAsc();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	/*
	 @Test
	 public void nom(){}
	 * */
}
