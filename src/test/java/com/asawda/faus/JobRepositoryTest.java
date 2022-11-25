package com.asawda.faus;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.asawda.faus.model.Job;
import com.asawda.faus.repository.JobRepository;

@SpringBootTest
public class JobRepositoryTest {
	@Autowired
	private JobRepository jobRepository;
	
	@Test
	public void testCreateJob() {
		Job job1 = new Job("ASSISTANTDEDIRECTION", "Non Cadre", 70000.0, 90000.0);
		jobRepository.save(job1);
		Job job2 = new Job("COACH", "Cadre", 100000.0, 200000.0);
		jobRepository.save(job2);
		Job job3 = new Job("COMMUNICATION", "Cadre", 100000.0, 200000.0);
		jobRepository.save(job3);
		Job job = new Job("COMPTABLE", "Cadre", 100000.0, 200000.0);
		jobRepository.save(job);
		Job job4 = new Job("DG", "Haut Cadre", 500000.0, 800000.0);
		jobRepository.save(job4);
		Job job5 = new Job("GARDIEN", "Non Cadre", 30000.0, 70000.0);
		jobRepository.save(job5);
		Job job6 = new Job("HOTESSE", "Non Cadre", 30000.0, 90000.0);
		jobRepository.save(job6);
		Job job7 = new Job("MENAGE", "Non Cadre", 30000.0, 70000.0);
		jobRepository.save(job7);
	}
}
