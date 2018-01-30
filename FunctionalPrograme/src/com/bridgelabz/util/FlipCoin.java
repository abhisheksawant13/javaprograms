/****************************************************************************** 
 *  Purpose: Creates a random Head or Tail and count number of head and tails
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

/*
* Creates a random Head or Tail and count number of head and tails
*/

public class FlipCoin {
	float headPercentrage;
	float tailsPercentage;
	public static void main(String args[]) {
       
	   //Taking number of times a coin should be tossed 
	   //and passing it to fuction.
       	   FlipCoin fc = new FlipCoin(); 
           fc.headOrTails(Integer.parseInt(args[0]));   
        }
    
        //Find head or tail.
        void headOrTails(int mTimes) {
		int heads=0;
		int tails=0;

        	for(int i=0;i<mTimes;i++) {

            		//If 0 to 0.49 then heads
            		//math.random() return a value between 0.0 and 1.0
            		if(Math.random() < 0.5) {
               		System.out.println("Heads");
               		heads++;
            		}

            		//If greater then 0.5 to 1  then tails
            		else {
       	       		System.out.println("Tails");
               		tails++;
            		}  	
        	}
		headPercentrage = heads/mTimes*100;
		tailsPercentage = tails/mTimes*100;
                System.out.println("Percentage Head is tossed is "+headPercentrage);
        	System.out.println("Percentage Tail is tossed is "+tailsPercentage);
       } 
							  
}
