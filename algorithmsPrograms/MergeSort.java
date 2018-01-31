package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter a string");
    	String inputString = scanner.nextLine().toLowerCase();
    	String[] actualString = inputString.split(" ");
    	String[] sortedString = mergeSort(actualString);
    	scanner.close();
    	for (String sorted : sortedString) {
            System.out.println(sorted);
        }
    	}
	public static String[] mergeSort(String[] string) {
        if (string.length >= 2) {
            String[] left = new String[string.length / 2];
            String[] right = new String[string.length - string.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = string[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = string[i + string.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(string, left, right);
        }
		return string;
    }

    public static void merge(String[] string, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < string.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareTo(right[b]) < 0)) {
                string[i] = left[a];
                a++;
            } else {
                string[i] = right[b];
                b++;
            }
        }
    }
}
