/****************************************************************************** 
 *  Purpose:Check if String is Anagram
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-08-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
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
        char[] strArr1 = Utility.stringModifier(str1);
        char[] strArr2 = Utility.stringModifier(str2);
        
        //if length of the returned string match then it might be anagram
        if(strArr1.length==strArr2.length) {
        	
        	//returns true if string a anagram
        	boolean checker = Utility.isAnagram(strArr1,strArr2);  
        	if(checker)
        		System.out.println("Given String is anagram");
        	else
        		System.out.println("Given string is not a anagram");
        }
        else {
        	System.out.println("Following String is not a Anagram");
        }
}

}