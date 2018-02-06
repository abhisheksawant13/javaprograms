package com.bridgelabz.dsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CalanderUsingStack {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a month from 1 to 12");
		int month = scanner.nextInt();
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		scanner.close();
		if(Integer.toString(year).length()!=4) {
			throw new Exception("Enter a valid year");
		}
		else if(month<1||month>12) {
			throw new Exception("Enter a valid month");
		}
		else {
			Utility.calanderUsingStack(month,year);
		}
	}
}
