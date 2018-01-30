/****************************************************************************** 
 *  Purpose: Power Of 2
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.programs;

/*
* Power of 2
*/
public class PowerOfN {
	public static void main(String args[]) {
	//Accepting the Power
	int power = Integer.parseInt(args[0]);
	int answer =1;
	//Condition to check for power
	if(power>=0&&power<31) {
		System.out.println(answer);
		for(int i=0;i<=power-1;i++) {
			answer *= 2; 
			System.out.println(answer);
		}
	}
	}
}

