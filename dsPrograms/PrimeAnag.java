package com.bridgelabz.dsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeAnag extends PrimeNumberTwoD{
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number where uptil you want prime numbers");
		int range = scanner.nextInt();
		scanner.close();
		String []primeList = Utility.checkPrime(range);
		primeAnagaramMatrix(primeList);
	}

		private static void primeAnagaramMatrix(String[] primeList) {
			ArrayList<ArrayList<String>>list =new ArrayList<ArrayList<String>>();
			for(int i =0;i<10;i++) {
					list.add(new ArrayList<String>());
				}
			for(int i =0;i<10;i++) {
				for(int j=i+1;j<primeList.length;j++) {
					if(Utility.checkAnagarm(primeList[i], primeList[j])) {
						list.get(i).add(primeList[i]);
						list.get(1).add(primeList[j]);				
						}
			}
		}
			for(int i =0;i<10;i++) {
				for(int j=0;j<list.get(i).size();j++) {
				System.out.print(" "+list.get(i).get(j));	
				}
				System.out.println();
			}
		
}*/
	public static void main(String[] args) {
		Utility.primeAnagaramDs();
		
	}
}