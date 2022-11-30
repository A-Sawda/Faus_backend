package com.asawda.faus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.asawda.faus.model.Employee;

@RepositoryRestResource(path="employee_rest") //de Spring Data REST, le chemin pour y accéder http://localhost:8080/faus/rest
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser notre appli angular uniquement à y accéder 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	//List<Employee> findByFullNameEmployee(String nom);
	List<Employee> findByFullNameEmployeeContains(String nom);

	//?1 premier paramètre, ?2 deuxième paramètre de findByNomPrix
	/*@Query("select p from Produit p where p.nomProduit like ?1% and p.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);*/

	
	@Query("select employee "
			+ "from Employee employee "
			+ "where employee.sexEmployee like :sex% "
			+ "and employee.salaryEmployee >= :salary")
	List<Employee> findBySexEmployeeSalaryEmployee (
			@Param("sex") String sex,
			@Param("salary") Double salary
			);

	//@Query("select employee from Employee employee where employee.job = ?1")
	//List<Employee> findByJob (Job job);

	List<Employee> findByJobIdJob(String id);

	List<Employee> findByOrderByFullNameEmployeeAsc();

	@Query("select employee"
			+ " from Employee employee"
			+ " order by employee.salaryEmployee DESC, employee.fullNameEmployee ASC")
	List<Employee> trierEmployeesSalaryEmployeeFullNameEmployee ();

}
