package com.bridgelabz.dsPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number you want to Search");
		int find = scanner.nextInt();
		scanner.close();
		BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/Desktop/number.txt"));
		String []numericData = br.readLine().split(",");
		String []sortedList = orderedList(numericData,find);
	}
	
	public static <T extends Comparable<T>> String[] orderedList(T[] array, T find) {
		LinkedList<T> list = new LinkedList<T>();
		for(int i = 0;i<array.length;i++) {
			list.add(array[i]);
		}
		if(list.contains(find)) {
			System.out.println("Found Your Item in List: Removing "+find);
			list.remove(find);
		}
		else {
			System.out.println("Adding to List "+find);
			list.addLast(find);
			}
		
		Collections.sort(list);
		String[] data = (String[]) list.toArray();
		return data;
		
		
	}
}