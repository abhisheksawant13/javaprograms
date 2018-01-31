package com.bridgelabz.functionalPrograms;
public class Coupon {

    // return a random number
    public static int getRandom(int num) {
        return (int) (Math.random() * num);
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int[] distinct(int num) {
	int[] array = new int[num+1];
	    //isGenerated[i] = true if random is already present
        boolean[] isGenerated = new boolean[num];
        // number of distinct collected
        int distinct  = 0;           
        //number of Random Number Passed
        int count = 0;                           

        // repeat until you've got all the needed numbers
        while (distinct < num) {
        	
            int value = getRandom(num);            
            //passes++
            count++;
            // find new random
            if (!isGenerated[value]) {           
		array[distinct]=value;                
		distinct++;
                isGenerated[value] = true;
            }
        }
    //Appending last position of Array with Count for number of passes
	array[distinct++]=count;
        return array;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int []elements = distinct(num);
        for (int i=0; i<(elements.length-1); i++) {
        		System.out.print(elements[i]);
			System.out.println("");
	}
	System.out.println("the Number of passes required are "+elements[num]);
    } 
}