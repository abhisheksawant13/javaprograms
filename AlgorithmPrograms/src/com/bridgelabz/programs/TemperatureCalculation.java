package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in farenith");
		double celcius = Utility.temperatureConversion(scan.nextDouble());
		scan.close();
		System.out.println("Temperature in Celcius is"+(float)celcius+"degree Celcius ");
	}

}
