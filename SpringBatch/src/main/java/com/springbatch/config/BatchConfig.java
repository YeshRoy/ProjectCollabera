package com.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.task.MyTaskOne;
import com.springbatch.task.MyTaskThree;
import com.springbatch.task.MyTaskTwo;
@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	@Autowired	
	private JobBuilderFactory builderFactory;
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step stepone() {
		return stepBuilderFactory.get("StepOne")
				.tasklet(new MyTaskOne())
				.build();
	}
	@Bean
	public Step steptwo() {
		return stepBuilderFactory.get("StepTwo")
				.tasklet(new MyTaskTwo())
				.build();
	}
	@Bean
	public Step stepthree() {
		return stepBuilderFactory.get("StepThree")
				.tasklet(new MyTaskThree())
				.build();
	}
	@Bean
	public Job demojob() {
		return builderFactory.get("demojob")
				.start(stepone())
				.next(steptwo())
				.next(stepthree())
				.build();
				
	}
}
