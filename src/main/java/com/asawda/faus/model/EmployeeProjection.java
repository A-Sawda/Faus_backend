package com.asawda.faus.model;

import org.springframework.data.rest.core.config.Projection;

//L’objectif des projections est de limiter le résultat JSON retourné à un certain nombre d’attributs
@Projection(name = "sexNameEmployee", types = { Employee.class })
public interface EmployeeProjection {

	public String getFullNameEmployee();
	public String getSexEmployee();
	// tester avec http://localhost:8080/faus/rest?projection=sexNameEmployee
}
