package com.bridgelabz.utility;
import java.util.Scanner;

public class BalancedParenthesis {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Expression");
		char []expressionArray =scanner.nextLine().toCharArray();
		scanner.close();
		if(Utility.balancedParenthesis(expressionArray))
			System.out.println("Arithmetic Expression is Balanced");
			else
			System.out.println("Arithmetic Expression is Not balanced");
	}
}
