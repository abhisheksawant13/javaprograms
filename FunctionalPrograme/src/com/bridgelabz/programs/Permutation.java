package com.bridgelabz.programs;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.nextLine();
		s.close();
		permuteString(0,str);

	}
	//Permutation of String
	static void permuteString(int fixed,String s) {
		//System.out.println(fixed);
		//System.out.println(s);
	    char[] chrArray=s.toCharArray();			//Temperory array to print the permutation
	    if(fixed==s.length())
	        System.out.println(s);			//print the temporary array
	    for(int i=fixed;i<s.length();i++) {
	        char c=chrArray[i];					//temperory character 
	        chrArray[i]=chrArray[fixed];
	        chrArray[fixed]=c;
	        String str1 = new String(chrArray);
	        permuteString(fixed+1,str1);
	    }   
	}

}
