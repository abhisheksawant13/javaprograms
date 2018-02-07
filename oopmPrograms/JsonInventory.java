package com.bridgelabz.oopmPrograms;
import java.util.Scanner;

import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;
public class JsonInventory {
	public static void main(String[] args) throws Exception {
		Scanner scanner = Utility.startScanner();
		String choice;
		do {
			System.out.println("What operation do you want to perform" +"\n1. Write to inventory "+"\n2. Read from inventory ");
			int option =scanner.nextInt();
			switch (option) {
			case 1: Utility.jasonInventory();
					break;
		
			case 2: System.out.println("Enter file name to read with absolute address:");
					String fileName=scanner.next();
					JSONObject inventory =Utility.readFromInventory(fileName);
					Utility.valueCalculation(inventory);
					break;
			default:System.out.println("Invalid");
				
		  }
			System.out.println("Do you want to continue(yes/no):");
			choice =scanner.next().toLowerCase();
		}while(choice.equals("yes"));
	}
}
