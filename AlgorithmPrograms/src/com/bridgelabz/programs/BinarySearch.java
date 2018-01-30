package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int length= s.nextInt();
		int array[] = new int[length];
		System.out.println("Enter elements");
		for(int i =0;i<length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Enter a number to find");
		int find = s.nextInt();
		int[] sortedArray = Utility.bubbleSort(array);
		s.close();
		if(Utility.binarySearch(sortedArray,find)) 
			System.out.println("Found Your Number");
		else
			System.out.println("Number not found");

}
}

