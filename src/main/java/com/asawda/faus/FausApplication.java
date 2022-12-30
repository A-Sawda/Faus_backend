package com.asawda.faus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.asawda.faus.model.Employee;
import com.asawda.faus.model.Job;

@SpringBootApplication
public class FausApplication implements CommandLineRunner /* Pour avoir id dans la sortie de rest */ {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(FausApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Employee.class, Job.class); // Retourne moi l'id pour les objets de
																				// type employee et job
	}

}
