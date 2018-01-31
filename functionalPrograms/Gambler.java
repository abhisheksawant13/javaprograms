/****************************************************************************** 
 *  Purpose: To find if Gambler goes broke or achieves the goal
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

/*
* To find if Gambler goes broke or achieves the goal.
*/

package com.bridgelabz.functionalPrograms;

public class Gambler{
	public static void main(String args[]) {
        
	        int amount  = Integer.parseInt(args[0]);    
	        int goal   = Integer.parseInt(args[1]);    
	        int trials = Integer.parseInt(args[2]);    

		// total number of bets made
	        int bets = 0;
	
	        // total number of games won        
	        int wins = 0;
		//number of Trials a gambler will do  
		for(int i =0;i<trials;i++){
			int earns = amount;
			while(earns > 0 && earns < goal){
				bets++;
				if(Math.random() > 0.5){
					earns++;
				}
				else {
					earns--;
				}
				if(earns == goal)
				wins++;
			}
		}	
		System.out.println("Number of Wins are "+wins);
		System.out.println("Number of Bets "+bets);
		
	}
}
