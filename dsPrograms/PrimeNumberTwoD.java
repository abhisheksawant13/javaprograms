package com.bridgelabz.dsPrograms;
import java.util.ArrayList;
import com.bridgelabz.utility.Utility;

public class PrimeNumberTwoD {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer>list =new ArrayList<Integer>();
		for(int i =0;i<=1000;i++) {
			if(Utility.isPrime(i)) {
				list.add(i);
			}
		}
		int []primeArray =new int[list.size()];
		for(int i =0;i<primeArray.length;i++){
			primeArray[i]=list.get(i).intValue();
		}
		Utility.twoDMatrix(primeArray);
	}
}