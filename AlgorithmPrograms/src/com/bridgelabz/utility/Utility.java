/****************************************************************************** 
 *  Purpose:Utility Class Containing various Methods
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   25-01-2018
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bridgeit
 *
 */
/**
 * @author bridgeit
 *
 */
public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.next();
	}

	public int getInteger() {
		return scanner.nextInt();
	}

	public double getDouble() {
		return scanner.nextDouble();
	}

	public boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public float getFloat() {
		return scanner.nextFloat();
	}
	
	public static boolean isp̋rime(int number) {
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
	/*
	 * @param string1
	 * 
	 * @param string2
	 * 
	 * @logic to find two string are anagram or not
	 */
	
	public static boolean checkAnagarm(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return false;
		} 
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		// sort array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	
	/**
	 * @param s
	 * @return returns true or false for a string
	 */
	public static boolean palindrome(String s) {
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) 
		{
			if (charArray[i] != charArray[length - 1 - i])
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number)
	{
		int n = number;
		int m = n;
		int a=0,x=0;  //temp variables
		 while(n > 0)
	        {
	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	        }
	        if(a == m)
	        {
	            return true;
	        }
	        else
	        {
	        	return false;
	        }
			
	}
	/**
	 * @param date
	 * @param month
	 * @param year
	 */
	public static void dayCalculation(int date,int month,int year) {

		//Calculates the year
		int y = year - (14 - month)/12;

		//Checks for leap Year
		int x = y + (y/4) - (y/100) + (y/400);

		//Checks for month
		int m = month + 12 * ((14 - month) / 12) - 2;

		//Checks the value associated with Day i.e from 0 to 6 
		int day = (date + x + (31 * m)/12)%7;

		calculate(day);

	}
	
	/*
	 * Function to check if Anagram
	 */
		private static boolean isAnagram(char[] strArr1, char[] strArr2) {
			int count = 0;
			for(int i =0;i<strArr1.length;i++) {
				if(strArr1[i]==strArr2[i])
					count = 1;
				else
					count = 0;
					break;
			}
		    if(count == 1)
		      return true;
	        else
	          return false;
	}
		
	/*
	 * Function to modify String
	 */
		private static char[] stringModifier(String str1) {
			char temp;
			String tempStr1 = str1.replaceAll("\\s","").toLowerCase(); 
			char[] tempChar = tempStr1.toCharArray();	//Conversion of string to char array
			
			//Sorting the array
			for(int i = 0;i<tempChar.length;i++) {
				for(int j = i+1;j<tempChar.length-1;j++) {
					if(tempChar[i]>tempChar[j]) {
						temp = tempChar[i];
						tempChar[i]=tempChar[j];
						tempChar[j]=temp;
					}
				}
			}
	 		return tempChar;
		}
	/*
	 * Display Day Taking the number for day as Input
	 */
	public static void calculate( int number) {
        //Prints the day
        if (number == 1)
		System.out.println("The day is Monday");

	    else if (number == 2)
		System.out.println("The day is Tuesday");

	    else if (number == 3)
		System.out.println("The day is Wednesday");

	    else if (number == 4)
		System.out.println("The day is Thrusday");

	    else if (number == 5)
		System.out.println("The day is Friday");

	    else if (number == 6)
		System.out.println("The day is Saturday");

	    else
		System.out.println("The day is Sunday");
	}
	
	   /**
	 * @param mTemperatureFarenheit
	 * @return
	 */
	public static double temperatureConversion(double mTemperatureFarenheit) {
 
       //formula for temperature conversion from farenheit to celcius
       double mTemperatureConverted = ((mTemperatureFarenheit - 32) / 1.8);
       return mTemperatureConverted;
	}
	   
	   /*
	    * Squareroot of a number
	    */
	   public static double sqrt(double c) {
			 double epsilon = 1e-15;	//Default Epsilon Value
			 double t = c;   			//Given Condition       
			 while (Math.abs(t - c/t) > epsilon*t) {	//Given condition
		            t = (c/t + t) / 2.0;
		        }
			 return t;
		    }
	   
	/**
	 * @param decimalNo
	 * @param size
	 * @return
	 */
	public static int[] toBinary(int decimalNo, int size) {
		int num = decimalNo;
		int binary[] = new int[size];
		int j = size - 1;
		while (num > 0) {
			binary[j--] = num % 2;
			num = num / 2;
		}
		return binary;
	}
	
	/**
	 * @param binaryNumber
	 * @return
	 */
	public static double swapNibble(int []binaryNumber) {
		int temp=0;
		for(int i =0,j=4;i<4;i++,j++) {
			temp = binaryNumber[i];
			binaryNumber[i]=binaryNumber[j];
			binaryNumber[j]=temp;
		}
		double decimalNumber=0;
		for(int i=0;i<binaryNumber.length-1;i++) {
			if(binaryNumber[i]==0) {
				decimalNumber= Math.pow(2, i);
			}
		}
		return decimalNumber;
	}
	
	/**
	 * @param integerArray
	 * @return
	 */
	public static int[] bubbleSort(int[] integerArray) {
		int n = integerArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (integerArray[j] > integerArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
		return integerArray;
}
	
	/**
	 * @param strArr
	 * @return
	 */
	public static String[] bubbleSortString(String[] stringArray) {
		for(int i=0; i<stringArray.length; i++)
		{
			for(int j=i+1; j<stringArray.length; j++)
			{
				if(stringArray[i].compareTo(stringArray[j])>0)
					
				{
					String temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}

			}
		}
		return stringArray;
}


	/**
	 * @param principal = princliple amount
	 * @param rate = rate of intrest	
	 * @param years = no of years
	 * @return
	 */
	public static double monthlyPayment(float principal,float rate,float years)
	{	
		float n = 12 * years;
		float r = rate / (12*100);
		double x = Math.pow(1+r,(-n));	
		
		double payment = ((principal*r) / (1-x));
		return payment;
}

	/**
	 * @param limit
	 * @return
	 */
	public static String[] checkPrime(int limit)
	{
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i < limit; i++) //limit  times
		{
			boolean isPrime = true;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime) 
			{
				array[position] = String.valueOf(i);//index ibvalue to string
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) 
		{
			array1[k] = array[k];
		}
		return array1;
	}
	
	/**
	 * @param sortedArray
	 * @param find
	 * @return
	 */
	public static boolean binarySearch(int[] sortedArray, int find) {
		int first =0;
		int last = sortedArray.length-1;
		int middle=(first+last)/2;
		while(first<=last) {
			if(sortedArray[middle]<find) {
				first=middle+1;
			}
			else if (sortedArray[middle]==find) {
				return true;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		return false;
	}

	
	public static boolean binarySearchString(String[] sortedArray, String find) {
	    int low = 0;
	    int high = sortedArray.length - 1;
	    int mid;

	    while (low <= high) {
	        mid = (low + high) / 2;

	        if (sortedArray[mid].compareTo(find) < 0) {
	            low = mid + 1;
	        } else if (sortedArray[mid].compareTo(find) > 0) {
	            high = mid - 1;
	        } else {
	            return true;
	        }
	    }

	    return false;
	}
	
	public static int[] insertionSort(int[] inputString) {
		for(int i = 1;i<inputString.length;i++) {
			for(int j =i;j>0;j--) {
				if(inputString[j]<inputString[j-1]) {
					 int temp = inputString[j];
	                    inputString[j] = inputString[j-1];
	                    inputString[j-1] = temp;
				}
			}
		}
		
		return inputString;
	}
	
	public static String[] insertionSortString(String[] inputString) {
		for(int i = 1;i<inputString.length;i++) {
			for(int j =i;j>0;j--) {
				if(inputString[j].compareTo(inputString[j-1])<0) {
					 String temp = inputString[j];
	                    inputString[j] = inputString[j-1];
	                    inputString[j-1] = temp;
				}
			}
		}
		
		return inputString;
	}
}
