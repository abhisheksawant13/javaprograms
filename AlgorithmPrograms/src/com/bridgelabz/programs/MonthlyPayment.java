package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String args[]) {
		double monthlySum = Utility.monthlyPayment(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
		System.out.println("The amount to be paid everymonth is "+monthlySum);
	}
}
