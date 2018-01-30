package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeAnagPalindrome 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter the limit");
		int limit =utility.getInteger();
        System.out.println("Prime numbers between 1 and " + limit);
        String [] strArray=Utility.checkPrime(limit);
        for(int i=0;i<strArray.length;i++)
        {
        System.out.print("\t"+strArray[i]+" ");
        }
        System.out.println("\n");
        
        //number that are prime and palindrome
        System.out.println("Number that are prime and palindrome");
        for(int i=0;i<limit;i++) {
        	if(Utility.isp̋rime(i)&&Utility.isPalindrome(i)) {
        		System.out.print("\t"+i);
        	}
        }
        System.out.println("\n");
        //Anagram and prime
        System.out.println("Anagram in given range of prime numbers are:");
        for (int i = 0; i < strArray.length; i++) 
        {
			for (int j = i + 1; j < strArray.length; j++) 
			{
				if (Utility.checkAnagarm(strArray[i], strArray[j]))
				{
					System.out.print("\t"+strArray[i]+" "+strArray[j]);
				}
			}
		}
        System.out.println("\n");
        /*System.out.println("Palindrome in given range of prime numbers are:");
		for (int i = 0; i < strArray.length; i++) 
		{
			if (Utility.palindrome(strArray[i]))
			{
				System.out.print(strArray[i]+"\t");
			}
		}*/
		

	}
	
}