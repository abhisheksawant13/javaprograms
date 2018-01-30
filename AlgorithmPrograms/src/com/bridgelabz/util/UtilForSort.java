package com.bridgelabz.util;

public class UtilForSort {
	/**
	 * @param integerArray
	 * @return
	 */
	public static void bubbleSort(int[] integerArray) {
		int n = integerArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (integerArray[j] > integerArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
            }
        }
        for(int i =0;i<integerArray.length;i++) {
    		System.out.println(integerArray[i]);
    		}
	}
	
	/**
	 * @param strArr
	 * @return
	 */
	public static void bubbleSortString(String[] stringArray) {
		for(int i=0; i<stringArray.length; i++)
		{
			for(int j=i+1; j<stringArray.length; j++)
			{
				if(stringArray[i].compareTo(stringArray[j])>0)
					
				{
					String temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}

			}
		}
		for(int i =0;i<stringArray.length;i++) {
		System.out.println(stringArray[i]);
		}
}
	/**
	 * @param sortedArray
	 * @param find
	 * @return
	 */
	public static void binarySearch(int[] sortedArray, int find) {
		boolean value = false;
		int first =0;
		int last = sortedArray.length-1;
		int middle=(first+last)/2;
		while(first<=last) {
			if(sortedArray[middle]<find) {
				first=middle+1;
			}
			else if (sortedArray[middle]==find) {
				value = true;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		if(value)
	    	System.out.println("Found");
	    else
	    	System.out.println("NotFound");
		System.out.println("Binary Search  for integers done");
	}

	
	public static boolean binarySearchString(String[] sortedArray, String find) {
	    int low = 0;
	    int high = sortedArray.length - 1;
	    int mid;

	    while (low <= high) {
	        mid = (low + high) / 2;

	        if (sortedArray[mid].compareTo(find) < 0) {
	            low = mid + 1;
	        } else if (sortedArray[mid].compareTo(find) > 0) {
	            high = mid - 1;
	        } else {
	            return true;
	        }
	    }

	    return false;
	}
	
	public static void insertionSort(int[] inputString) {
		for(int i = 1;i<inputString.length;i++) {
			for(int j =i;j>0;j--) {
				if(inputString[j]<inputString[j-1]) {
					 int temp = inputString[j];
	                    inputString[j] = inputString[j-1];
	                    inputString[j-1] = temp;
				}
			}
		}
		
		for(int i =0;i<inputString.length;i++) {
			System.out.println(inputString[i]);
			}
	}
	
	public static void insertionSortString(String[] inputString) {
		for(int i = 1;i<inputString.length;i++) {
			for(int j =i;j>0;j--) {
				if(inputString[j].compareTo(inputString[j-1])<0) {
					 String temp = inputString[j];
	                    inputString[j] = inputString[j-1];
	                    inputString[j-1] = temp;
				}
			}
		}
		
		System.out.println("InsertionSort for String done");
	}
	
	
}
