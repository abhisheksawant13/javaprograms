package com.bridgelabz.programs;

public class NumberConversion {
	public static void main(String args[]) {
		int num = 321;
		int x,y,z;
		x=(num/10)%10;
		y=x%10;
		z=y/100;
		System.out.println(+x+""+y+""+z);
	}
}
