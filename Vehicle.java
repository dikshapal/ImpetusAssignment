package com.impetus;

public class Vehicle {
	private String model;
	private int registrationNumber;
	private float speed;
	private float capacity;
	private float consumption;

	/**
	 * @param vehicleModel Model of the vehicle
	 * @param vehicleNumber Registration Number of the vehicle
	 * @param vehicleSpeed Speed of the vehicle
	 * @param vehicleCapacity Capacity of the vehicle
	 * @param vehicleConsumption Consumption of the vehicle
	 */
     protected Vehicle(final String vehicleModel , final int vehicleNumber ,
    		           final float vehicleSpeed , final float vehicleCapacity ,
    		           final float vehicleConsumption) {
		this.model = vehicleModel;
		this.registrationNumber = vehicleNumber;
		this.speed = vehicleSpeed;
		this.capacity = vehicleCapacity;
		this.consumption = vehicleConsumption;
	}

	/**
	 * @return returns the vehicle model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param vehicleModel takes model of the vehicle as argument
	 */
	public void setModel(final String vehicleModel) {
		this.model = vehicleModel;
	}

	/**
	 * @return returns the registration number
	 */
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	/**
     * @param vehicleRegistrationNumber takes registration number
     * of the vehicle as argument
	 */
	public void setRegistrationNumber(final int vehicleRegistrationNumber) {
		this.registrationNumber = vehicleRegistrationNumber;
	}

	/**
	 * @return returns the speed of the vehicle
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param vehicleSpeed takes speed(in km/h) as argument
	 */
	public void setSpeed(final float vehicleSpeed) {
		this.speed = vehicleSpeed;
	}

	/**
	 * @return returns the capacity of the vehicle
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * @param vehicleCapacity takes capacity of the vehicle as argument
	 */
	public void setCapacity(final float vehicleCapacity) {
		this.capacity = vehicleCapacity;
	}

	/**
	 * @return returns the fuel consumption
	 */
	public float getConsumption() {
		return consumption;
	}

	/**
	 * @param vehicleConsumption takes fuel consumption(in km/liter) as argument
	 */
	public void setConsumption(final float vehicleConsumption) {
		this.consumption = vehicleConsumption;
	}

	/**
	 * @param distance takes distance(in kms) as argument
	 * @return returns the fuel needed to cover given distance
	 */
	public float fuelNeeded(final int distance) {
		return distance / consumption;
	}

	/**
	 * @param time takes time(in hours) as argument
	 * @return returns the distance covered in the given time
	 */
	public float distanceCovered(final float time) {
		return speed * time;
	}

	/**
	 * display() method displays the specifications of the vehicle
	 */
	public void display() {
		System.out.println("Vehicle Model:" + model);
		System.out.println("Registration Number:" + registrationNumber);
		System.out.println("Speed:" + speed);
		System.out.println("Consumption:" + consumption);
		System.out.println("Capacity:" + capacity);
	}

}
