package com.bridgelabz.dsPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String source = "/home/bridgeit/Desktop/abhishek.txt";
		BufferedReader br = new BufferedReader(new FileReader(source)); 
		String string[] = br.readLine().split(",");
		br.close();
		System.out.println("Enter a word");
		String choice = scanner.next().toLowerCase();
		scanner.close();
		Utility.unOrderedList(string,choice,source);
}

}
