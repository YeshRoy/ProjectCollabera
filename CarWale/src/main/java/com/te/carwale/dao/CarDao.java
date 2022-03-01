package com.te.carwale.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.te.carwale.bean.CarDetails;

@EnableJpaRepositories
public interface CarDao extends CrudRepository<CarDetails, Integer> {
	
	public CarDetails findByCarId(int id);

}
