package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		double number = scan.nextDouble();
		scan.close();
		double squareRoot=0; 
		if(number<0) {
			System.out.println("Roots are Imaginary or Not Possible");
		}
		else { 
			squareRoot=Utility.sqrt(number);
		}
		System.out.println("Square Root of "+number+" is "+squareRoot);
	}

}