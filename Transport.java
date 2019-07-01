package com.impetus;

import java.util.Scanner;
/**
 * @author diksha
 *
 */
public final class Transport {
	/**
	 * private constructor
	 */
	private Transport() {
	}
	/**
	 * @param args Command Line Arguments
	 */
	public static void main(final String[] args) {
		final Scanner s = new Scanner(System.in);
		final int distance;
		final int time;
		System.out.println("Enter distance covered:");
		distance = s.nextInt();
		System.out.println("Enter time taken:");
		time = s.nextInt();
		final Truck truck = new Truck("Blazo X 55" , 784739 , 80 , 330 , 20 , 500);
		final Bus bus = new Bus("Cosmo" , 858394 , 60 , 60 , 25 , 60);
		System.out.println("Truck Specifications:");
		truck.display();
		System.out.println("Fuel Needed:" + truck.fuelNeeded(distance));
		System.out.println("Distance Covered:" + truck.distanceCovered(time));
		System.out.println("Bus Specifications:");
		bus.display();
		System.out.println("Fuel Needed:" + bus.fuelNeeded(distance));
		System.out.println("Distance Covered:" + bus.distanceCovered(time));
		s.close();
	}

}
