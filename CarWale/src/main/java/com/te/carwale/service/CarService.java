package com.te.carwale.service;

import com.te.carwale.bean.CarDetails;

public interface CarService {
	
	public CarDetails findByCarId(int id);
	
	public CarDetails addData(CarDetails details);

}
