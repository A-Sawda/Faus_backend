package com.asawda.faus.service;

import java.util.List;

import com.asawda.faus.model.Job;

public interface JobService {

	Job createJob(Job j);
	Job updateJob(Job j);
	List<Job> getAllJobs();
	Job getJob(String id);
	void deleteJob(Job j);
	void deleteJobById(String id);
}
