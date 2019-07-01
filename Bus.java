package com.impetus;

public final class Bus extends Vehicle {

	private int numberOfPassengers;
	/**
	 * @param model Model of the bus
	 * @param registrationNumber Registration number of the bus
	 * @param speed Speed of the bus in km/h
	 * @param capacity Capacity of the bus in liters
	 * @param consumption Consumption of the bus in km/liter
	 * @param passengers passengers Number of passengers in the bus
	 */
	public Bus(final String model , final int registrationNumber ,
			   final float speed , final float capacity ,
			   final float consumption , final int passengers) {
		super(model , registrationNumber , speed , capacity , consumption);
		this.numberOfPassengers = passengers;
	}

	/**
	 * @return returns number of passengers in the bus
	 */
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	/**
	 * @param passengers sets numbers of passenger in the bus
	 */
	public void setNumberOfPassengers(final int passengers) {
		this.numberOfPassengers = passengers;
	}

	/**
	 *override display method of Vehicle class
	 *this method displays specifications of the bus
	 */
	@Override
	public void display() {
		super.display();
		System.out.println("Number of Passengers:" + numberOfPassengers);
	}
}
