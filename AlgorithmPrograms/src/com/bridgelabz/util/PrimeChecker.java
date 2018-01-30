package com.bridgelabz.util;

public class PrimeChecker {

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
