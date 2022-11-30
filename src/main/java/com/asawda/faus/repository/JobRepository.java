package com.asawda.faus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.asawda.faus.model.Job;

@RepositoryRestResource(path = "job_rest")
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser notre appli angular uniquement à y accéder 
public interface JobRepository extends JpaRepository<Job, String> {

}
