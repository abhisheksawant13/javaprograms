/****************************************************************************** 
 *  Purpose:Simulate Stop watch
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-08-2018
 *
 ******************************************************************************/
 
 /*
 * Simulate StopWatch
 */
package com.bridgelabz.functionalPrograms;
public class StopWatch {
	public static void main(String args[]){
	int range =(int)(Math.random()*5)+1;
	double currentTime1 = java.lang.System.currentTimeMillis();
        double currentTime2 = java.lang.System.currentTimeMillis();
        int i = 0; 
	while(i<range){
		currentTime2 =currentTime2+range;
		i++;	
	}
	System.out.println("Elapsed Time is"+(currentTime2-currentTime1));
}
}