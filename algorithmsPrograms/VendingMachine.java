package com.bridgelabz.algorithmsPrograms;

import java.util.Scanner;

public class VendingMachine {
	//public static int noteCount =0,twoThousand=0,fiveHundred=0,oneHundred=0,fiftyRupees=0,twentyRupees=0,tenRupees=0,fiveRupees=0,tworupees=0,oneRupees=0;
	public static int noteCount= 0;
	public static int[] countOfNotes =new int[8]; 
	public static void main(String[] args) {
		int notes[]= {2000,500,100,50,20,10,5,1};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount to be Withdrawn");
		int value =scan.nextInt();
		scan.close();
		int noOfNotes=returnNotes(value,notes);
		System.out.println("No of Notes to be dispensed are"+noOfNotes);
		for(int i = 0;i<8;i++) {
			if(countOfNotes[i]>0)
			System.out.println("You will Get "+countOfNotes[i]+" "+notes[i]+"Rs Notes");
		}
	}

	private static int returnNotes(int value,int[]notes) {
		int amount =value;
		if(value!=0) {
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				amount -=notes[i];
				countOfNotes[i]+=1;
				//System.out.println("you will get "+notes[i]+"Rs note");
				noteCount++;
			}
		}
		returnNotes(amount,notes);
		}
		return noteCount;
	}
}
