package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Binary {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number =scan.nextInt();
		scan.close();
		int []binary = Utility.toBinary(number,8);
		System.out.println("Binary number before swap");
		for(int i =0;i<binary.length;i++) {
			System.out.print(binary[i]);
		}
		System.out.println("\n\n");
		System.out.println("Decimal Number after swap");
		int decimal = Utility.swapNibble(binary);
		System.out.println(decimal);
	}
}