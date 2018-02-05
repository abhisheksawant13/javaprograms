package com.bridgelabz.dsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number of People Today at bank");
		int numberOfPeople = scanner.nextInt();
		Utility.bankingCashCounter(numberOfPeople);
	}

}
