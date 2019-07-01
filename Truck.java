package com.impetus;


public class Truck extends Vehicle {
	private float cargoWeightLimit;

	/**
	 * @param model Model of the truck
	 * @param registrationNumber Registration Number of the truck
	 * @param speed Speed of the truck
	 * @param capacity Capacity of the truck
	 * @param consumption Consumption of the truck
	 * @param weightLimit Weight Limit of the truck
	 */
	public Truck(final String model , final int registrationNumber ,
		         final float speed , final float capacity ,
		         final float consumption , final float weightLimit) {
		super(model , registrationNumber , speed , capacity , consumption);
		this.cargoWeightLimit = weightLimit;
	}

	/**
	 * @return returns the weight limit of the truck
	 */
	public float getCargoWeightLimit() {
		return cargoWeightLimit;
	}

	/**
     * @param weightLimit this method sets the weight limit of the truck
	 */
	public void setCargoWeightLimit(final float weightLimit) {
		this.cargoWeightLimit = weightLimit;
	}

	/**
	 *override display method of Vehicle class
	 *this method displays specifications of the truck
	 */
	@Override
	public void display() {
		super.display();
		System.out.println("Weight Limit:" + cargoWeightLimit);
	}

}
