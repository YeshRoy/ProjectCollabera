package com.te.carwale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.carwale.bean.CarDetails;
import com.te.carwale.dao.CarDao;

@Service
public class CarServiceImp implements CarService {
	
	@Autowired
	private CarDao dao;

	@Override
	public CarDetails findByCarId(int id) {
		return dao.findByCarId(id);
	}

	@Override
	public CarDetails addData(CarDetails details) {
		return dao.save(details);
	}

}
