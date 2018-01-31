package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

public class FindYourNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			int N = scan.nextInt();
			int size=(int) Math.pow(2, N);
			int []arrayOfElement = new int[size];
			for(int i=0;i<size;i++) {
				arrayOfElement[i]=i;
			}
			System.out.println("Choose a number from the Following list");
			for(int i=0;i<size;i++) {
				System.out.print(arrayOfElement[i]);
				System.out.print(" ");
			}
			int first= 0;
			int last = arrayOfElement.length;
			int mid = (first+last)/2;
			boolean answer = false;
			while(first<=last) {
				System.out.println("\n\nIs your number between "+arrayOfElement[first]+" and "+arrayOfElement[mid]);
				answer=scan.nextBoolean();
				if(answer) {
					last=mid+1;
				}
				else{
					first =mid+1;
				}
				if(mid-first==1) {
					System.out.println("Is your Number greater then "+arrayOfElement[first]+" ?");
					answer=scan.nextBoolean();
					if(answer)
						System.out.println("Thanks for telling your number is "+arrayOfElement[mid]);
					else
						System.out.println("Thanks for telling your number is "+arrayOfElement[first]);
					break;
				}
				if(first==mid&&answer) {
					System.out.println("your number is "+arrayOfElement[mid]);
					break;
				}
				mid=(first+last)/2;
				}
			scan.close();
		}
	}