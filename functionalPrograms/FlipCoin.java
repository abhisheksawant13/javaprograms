package com.bridgelabz.functionalPrograms;

public class FlipCoin {
	float headPercentrage=0;
	float tailsPercentage=0;
	public static void main(String args[]) {
       
	   //Taking number of times a coin should be tossed 
	   //and passing it to fuction.
       	   FlipCoin fc = new FlipCoin(); 
           fc.headOrTails(Integer.parseInt(args[0]));   
        }
    
        //Find head or tail.
        void headOrTails(int mTimes) {
		double heads=0;
		double tails=0;

        	for(int i=0;i<mTimes;i++) {

            		//If 0 to 0.49 then heads
            		//math.random() return a value between 0.0 and 1.0
            		if(Math.random() < 0.5) {
               		System.out.println("Heads");
               		heads++;
               		System.out.println(heads);
            		}

            		//If greater then 0.5 to 1  then tails
            		else {
       	       		System.out.println("Tails");
               		tails++;
               		System.out.println(tails);
            		}  	
        	}
		headPercentrage += heads/mTimes*100;
		tailsPercentage += tails/mTimes*100;
                System.out.println("Percentage Head is tossed is "+headPercentrage);
        	System.out.println("Percentage Tail is tossed is "+tailsPercentage);
       } 
							  
}