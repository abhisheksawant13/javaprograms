package com.bridgelabz.programs;

public class converter {
	public static void main(String arg[]) {
		int []arr = {1,2,3,4,5,6};
		reverseArrayConverter(arr);
		}
	public static int[] toIntArrayConverter(int number){
			String str = Integer.toString(number);
			int intArray[] = new int[str.length()];
			for(int i=0;i<str.length();i++) {
				intArray[i]=str.charAt(i);
			}
			return intArray;
}

	public static int[] reverseArrayConverter(int[] intArr) {
		for (int i = 0; i < intArr.length / 2; i++) {
			  int temp = intArr[i];
			  intArr[i] = intArr[intArr.length - 1 - i];
			  intArr[intArr.length - 1 - i] = temp;
			}
		return intArr;
	}


}
