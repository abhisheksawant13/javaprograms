package com.bridgelabz.dsPrograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class OrderedList {
	public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
		String source = "/home/bridgeit/Desktop/number.txt";
		BufferedReader br = new BufferedReader(new FileReader(source)); 
		String filestring[] = br.readLine().split(" ");
		br.close();
		int[] array = Arrays.stream(filestring).mapToInt(Integer::parseInt).toArray();
		System.out.println("Enter a NUmber");
		int choice = scanner.nextInt();
		scanner.close();
		Utility.orderedList(array,choice,source);
}
}