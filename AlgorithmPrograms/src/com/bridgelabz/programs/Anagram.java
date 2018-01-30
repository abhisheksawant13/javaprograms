/****************************************************************************** 
 *  Purpose:Check if String is Anagram
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-08-2018
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;
/*
* Anagram Checker
*/
public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter first string:"); 
        String str1=s.nextLine();
        System.out.println("Enter second String");
        String str2 =s.nextLine();
        s.close();
        char[] strArr1 = stringModifier(str1);
        char[] strArr2 = stringModifier(str2);
        
        //if length of the returned string match then it might be anagram
        if(strArr1.length==strArr2.length) {
        	boolean checker = isAnagram(strArr1,strArr2);  //returns true if string a anagram
        	if(checker)
        		System.out.println("Given String is anagram");
        	else
        		System.out.println("Given string is not a anagram");
        }
        else {
        	System.out.println("Following String is not a Anagram");
        }
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
}
