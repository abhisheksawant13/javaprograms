package com.bridgelabz.algorithmsPrograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinaryNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number =scan.nextInt();
		scan.close();
		int []binary = Utility.toBinary(number,32);
		for(int i =0;i<binary.length;i++) {
			System.out.print(binary[i]);
		}
	}
	
}
