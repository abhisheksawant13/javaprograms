/****************************************************************************** 
 *  Purpose: To print the UserName
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/*
* To print the UserName
*/

public class Name {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		//Accepting username from the user
		String string= "Hello user how are you";
		System.out.println(string);
		System.out.println("\nEnter a word you want to be replaced from above");
		String replace = scanner.next();
		System.out.println("Enter the string you want to replace with ");
		String replacewith = scanner.next();
		scanner.close();
		if(string.length()>3) {
		String newString = string.replace(replace, replacewith);
		System.out.println(newString);
		}
		else
		{
			System.out.println("Enter a valid word");
		}
		//System.out.println("Hello "+str1+", How are you?");
	}
}