/****************************************************************************** 
 *  Purpose:Find Prime Number In Range
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-08-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmsPrograms;
public class PrimeNumber {
		public static void main(String args[]) {
			int count =0;
			for(int i =0;i<1000;i++) {
				if(isprime(i)){ 
					System.out.println(i);
				count++;
				}
			}
			System.out.println("Number of prime numbers are "+count);
		}
		//Prime Checker
		public static boolean isprime(int number) {
			int count = 0;
		
			for(int i=1;i<=number;i++){
	 			if((number % i) == 0)                                          
	   				 count++;
	        		} 

	        		if(count == 2)
	           			return true;
	        		else                                                    
	           		return false;
	   	}
}

