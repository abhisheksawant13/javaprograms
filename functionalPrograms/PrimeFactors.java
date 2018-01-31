/****************************************************************************** 
 *  Purpose: Find the Prime Factor using brute force
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

/*
* Find the Prime Factor using brute force
*/
package com.bridgelabz.functionalPrograms;
public class PrimeFactors {
	public static void main(String args[]){
		int numberN = Integer.parseInt(args[0]);
		PrimeFactors pf = new PrimeFactors();
		pf.primeFactorFinder(numberN);
	}
	//Prime Factor Checker
	public void primeFactorFinder(int numberN){
		for(int i=1;i<=numberN;i++) {
			if(numberN%i==0){
				if(isprime(i)){
				System.out.println("The Prime Factor is "+i);
				}
			}
		}
	}
	//Prime Number Checker
	public boolean isprime(int number) {
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
				