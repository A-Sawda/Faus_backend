package com.asawda.faus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asawda.faus.model.Job;
import com.asawda.faus.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobRepository jobRepository;

	@Override
	public List<Job> getAllJobs() {
		return jobRepository.findAll();
	}

	@Override
	public Job getJob(String id) {
		return jobRepository.findById(id).get();
	}

	@Override
	public Job createJob(Job j) {
		return jobRepository.save(j);
	}

	@Override
	public Job updateJob(Job j) {
		return jobRepository.save(j);
	}

	@Override
	public void deleteJob(Job j) {
		jobRepository.delete(j);
	}

	@Override
	public void deleteJobById(String id) {
		jobRepository.deleteById(id);
	}

}
