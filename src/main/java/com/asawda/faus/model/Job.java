package com.asawda.faus.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Jobs")
public class Job {
	
	@Id
	private String idJob;
	private String statusJob;
	private Double salaryMinJob;
	private Double salaryMaxJob;
	
	//OneToMany(mappedBy = "job") // could not initialize proxy - no Session
	@OneToMany(fetch = FetchType.EAGER)// pour résoudre le problème could not initialize proxy - no Session
	//@JoinColumn(name = "job_id_job") //pour n'avoir que mes deux tables que mappedBy m'assurait
	@JsonIgnore
	private List<Employee> employees;

	public Job(String idJob, String statusJob, Double salaryMinJob, Double salaryMaxJob) {
		super();
		this.idJob = idJob;
		this.statusJob = statusJob;
		this.salaryMinJob = salaryMinJob;
		this.salaryMaxJob = salaryMaxJob;
	}

}
