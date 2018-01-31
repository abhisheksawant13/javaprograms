/****************************************************************************** 
 *  Purpose: Find if year is Leap Year
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalPrograms;

/*
* Check if The Year is Leap year
*/
public class LeapYear{
	public static void main (String args[]){
		//Accepting Year
		int num = Integer.parseInt(args[0]);	 
		LeapYear lp = new LeapYear();
		
		//Checking for valid Year
		if(Integer.toString(num).length()==4)
			lp.leapYearFinder(num);
		else
			System.out.println("Enter a valid Year"); 

	}
	public void leapYearFinder(int year){
		 if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        System.out.println("Year " + year + " is a leap year");
		 }
                 else {
                        System.out.println("Year " + year + " is not a leap year");
		 }
	}
}
