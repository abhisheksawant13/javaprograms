package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date");
		int date = scanner.nextInt();
		System.out.println("Enter month 1 for jan 2 for feb and so on");
		int month =scanner.nextInt();
		System.out.println("Enter year");
		int year = scanner.nextInt();
		scanner.close();
		Utility.dayCalculation(date, month, year);
	}

	}
