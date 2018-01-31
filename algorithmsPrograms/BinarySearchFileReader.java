
package com.bridgelabz.algorithmsPrograms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

import java.io.BufferedReader;
import java.io.FileReader;

public class BinarySearchFileReader {

	public static void main(String[] args)throws Exception {
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Desktop/abhishek.txt"));
		String str = br.readLine();
		String []str2 = str.split(",");
		String[] fileContent = Utility.bubbleSortString(str2);
		System.out.println("Enter a String to Search");
		String find = s.next();
		s.close();
		br.close();
		if(Utility.binarySearchString(fileContent,find)) 
			System.out.println("Found Your String");
		else
			System.out.println("Your String not Found");

	}
}