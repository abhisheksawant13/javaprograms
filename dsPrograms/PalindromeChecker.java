package com.bridgelabz.dsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputString = scanner.nextLine().toLowerCase();
		if(Utility.ispalindromeCheckerDs(inputString))
			System.out.println("Entered String is Palindrome");
		else
			System.out.println("Entered String is not Palindrome");
		scanner.close();
	}
}
