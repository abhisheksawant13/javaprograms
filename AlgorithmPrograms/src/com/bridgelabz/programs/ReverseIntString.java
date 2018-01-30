package com.bridgelabz.programs;

public class ReverseIntString {
	public static void main(String args[]) {
		int []array = {1,2,4,5,6};
		for (int i = 0; i < array.length / 2; i++) {
			  int temp = array[i];
			  array[i] = array[array.length - 1 - i];
			  array[array.length - 1 - i] = temp;
			}
			System.out.println(array);
		}
	}

