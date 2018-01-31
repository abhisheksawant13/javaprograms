/****************************************************************************** 
 *  Purpose: Determines the distance between (x,y) to the origin (0,0).
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/
 
 /*
 * Determines the distance between (x,y)
 */
package com.bridgelabz.functionalPrograms;
public class Distance {
	
	public static void main(String args[]) {

	Distance dis = new Distance();	
	dis.distanceCalc(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
	
    //Calculating the distance
	void distanceCalc(int x,int y) {

	double mDistance = Math.sqrt(x*x + y*y);
	double power = Math.pow(x,3);
	System.out.println(" distance from (" +x+ "," +y+ ") to (0,0) is  " + mDistance);
	System.out.println(" power of x = " +power);
	}
}