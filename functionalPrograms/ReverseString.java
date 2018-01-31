package com.bridgelabz.functionalPrograms;

public class ReverseString {
	public static void main(String args[]) {
		int []intArr = {1,2,4,5,6};
		int reverseArray[] = new int[intArr.length-1];
		for(int i=intArr.length-1;i>=0;i++) {
			for(int j=0;j<intArr.length;j++) {
				reverseArray[j]=intArr[i];
			}
			System.out.println(intArr);
		}
	}

}