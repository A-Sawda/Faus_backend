package com.asawda.faus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asawda.faus.model.Job;

public interface JobRepository extends JpaRepository<Job, String> {

}
