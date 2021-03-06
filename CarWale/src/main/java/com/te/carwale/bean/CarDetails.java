package com.te.carwale.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class CarDetails {

	@Id
	@Column(name = "car_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;

	@Column(name = "car_name")
	private String carName;

	@Column(name = "car_company")
	private String carCompany;

	@Column(name = "car_steering")
	private boolean powerStreeing;

	@Column(name = "car_break")
	private String breakSystem;

	@Column(name = "car_price")
	private double showroomPrice;

	@Column(name = "onRoad_price")
	private double onroadPrice;

	@Column(name = "image_url")
	private String imageUrl;

	@Column(name = "mileage")
	private double mileage;

	@Column(name = "seating_capacity")
	private int seatingCapacity;

	@Column(name = "Engin_capacity")
	private int engineCapacity;

	@Column(name = "Gear_type")
	private String gearType;

	@ManyToOne
	@JoinColumn(name="admin_id",referencedColumnName = "admin_id")
	private Admin admin;
}
