package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		scan.close();
		String []inputString = str.split("");
		String []sortedString = Utility.bubbleSortString(inputString);
		for(int i=0;i<sortedString.length;i++) {
			System.out.print(sortedString[i]);
		}
	}

}