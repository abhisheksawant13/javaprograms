package com.bridgelabz.dsPrograms;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class HashingFunction {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		//accepting a number to find
		System.out.println("Enter a NUmber you want to search");
		int choice = scanner.nextInt();
		scanner.close();
		Utility.hashingFunction(choice);
	}
}
