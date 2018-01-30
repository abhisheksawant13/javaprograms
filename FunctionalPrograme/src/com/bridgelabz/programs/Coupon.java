package com.bridgelabz.programs;
import java.lang.*;
import java.util.*;
public class Coupon {

    // return a random number
    public static int getRandom(int num) {
        return (int) (Math.random() * num);
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int[] distinct(int num) {
	int[] array = new int[num+1];
        boolean[] isGenerated = new boolean[num];  // isGenerated[i] = true if random is already present
        int distinct  = 0;                       // number of distinct collected
	int count = 0;                           // number of Random Number Passed

        // repeat until you've got all the needed numbers
        while (distinct < num) {
            int value = getRandom(num);            // pick a random number 
            count++;                             // passes++
            if (!isGenerated[value]) {           // find new random
		array[distinct]=value;                
		distinct++;
                isGenerated[value] = true;
            }
        }
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
