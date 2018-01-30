/****************************************************************************** 
 *  Purpose: Determines the square root using Quadratic Equation
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2017
 *
 ******************************************************************************/


package com.bridgelabz.programs;

/*
* Finds the Roots using quadratic equation
*/

import java.util.Scanner;

public class Quadratic {

	public static void main(String args[]) {
 
	   double root1,root2,d;

	   Scanner s = new Scanner(System.in);

	   int a = Integer.parseInt(args[0]);
	   int b = Integer.parseInt(args[1]);
 	   int c = Integer.parseInt(args[2]);

	   //Displaying Entered Value
	   System.out.println("given quadratic equation " +a+ " " +b+ " " +c);


	   //Calculating Delta Values
	   d = (b * (b-4) * a * c);
	   
	   //If Delta is not negative
	   if(d > 0) {
		System.out.println("roots are real and unequal");
		//Displaying Roots
		System.out.println("first root  is:" +(- b + Math.sqrt(d)) / (2 * a));
		System.out.println("second root is:" +(- b - Math.sqrt(d)) / (2 * a));
	   } 
	   //calculating root when delta is 0
	   else if(d == 0) {
		System.out.println("roots are real and equal");
		System.out.println("root:" +( - b + Math.sqrt(d)) / (2 * a));
	   }
	   //If above condition dont satisfy then roots are imaginary
	   else {
	   	System.out.println("roots are imaginary");
	   }
	}
}

 
 
