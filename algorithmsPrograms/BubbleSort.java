package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


public class BubbleSort {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size =scan.nextInt();
		int []integerArray = new int[size];
		System.out.println("Enter the Elements");
		for(int i =0;i<size;i++) {
			integerArray[i]=scan.nextInt();
		}
		scan.close();
		int sortedArray[] = Utility.bubbleSort(integerArray);
		for(int i =0;i<size;i++) {
			System.out.println(sortedArray[i]);
		}
	}
}