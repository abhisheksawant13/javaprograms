package com.bridgelabz.programs;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size=s.nextInt();
		int []actualArray = new int[size];
		System.out.println("Enter Elements");
		for(int i =0;i<size;i++) {
			actualArray[i]=s.nextInt();
		}
		s.close();
		int []sortedArray=mergeSort(actualArray,0,actualArray.length-1);
		printArray(sortedArray);
	}

	private static void printArray(int[] sortedArray) {
		for(int i=0;i<sortedArray.length;i++) {
			System.out.println(sortedArray[i]);
		}
		
	}

	private static int[] mergeSort(int[] actualArray, int startingIndex, int endingIndex) {
		if(actualArray.length==1) {
			return actualArray;
		}
		//Dividing Array into 2 halves
		 int middle = startingIndex + (endingIndex - startingIndex) / 2;
		
		//Recurssion for dividing array
		int arrayLeft[] =mergeSort(actualArray, startingIndex, middle);
		int arrayRight[] =mergeSort(actualArray, middle+1, endingIndex);
		//now that the array is divided into two parts
		//merge the array that we assume is sorted
		int []sortedArray =arrayMerge(arrayLeft,arrayRight);
		return sortedArray;
	}

	public static int[] arrayMerge(int[] arrayLeft, int[] arrayRight) {
			int resultant[] = new int[(arrayLeft.length+arrayRight.length)-1];
			int i=0;
			int j=0;
			int k=0;
			while(i!=arrayLeft.length&&i!=arrayRight.length) {
				if(arrayLeft[i]<arrayRight[j]) {
					resultant[k]=arrayLeft[i];
					i++;k++;
				}
				if(arrayLeft[i]==arrayRight[j]) {
					resultant[k]=arrayLeft[i];
					i++;k++;j++;
				}
				else if(arrayLeft[i]>arrayRight[j]) {
					resultant[k]=arrayRight[j];
					j++;k++;
				}
				if(i<arrayLeft.length) {
					while(i!=arrayLeft.length) {
						resultant[k]=arrayLeft[i];
						k++;i++;
					}
				}
				else if(j<arrayRight.length) {
					while(j!=arrayRight.length) {
						resultant[k]=arrayRight[i];
						k++;j++;
					}
				}
			}
		return resultant;
	}

}
