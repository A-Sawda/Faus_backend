package com.asawda.faus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asawda.faus.model.Job;
import com.asawda.faus.service.JobService;

@RestController
@RequestMapping("/api/job") // pour accéder aux méthodes : localhost:8080/faus/api
@CrossOrigin
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Job> getAllEmployees(){
		return jobService.getAllJobs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Job getJobById(@PathVariable("id") String id) {
		return jobService.getJob(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void createJob(@RequestBody Job job) {
		jobService.createJob(job);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateJob(@RequestBody Job job) {
		jobService.updateJob(job);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteJob(@RequestBody Job j) {
		jobService.deleteJob(j);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJobById(@PathVariable("id") String id) {
		jobService.deleteJobById(id);
	}

}
