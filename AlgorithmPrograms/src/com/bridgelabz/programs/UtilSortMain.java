package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.UtilForSort;
import com.bridgelabz.utility.Utility;


public class UtilSortMain extends UtilForSort{
	static String []algoArray = {"bubbleSort","binarySearch","insertionSort","bubbleSortString","binarySearchString","insertionSortString"};
	static double []elapsedTime =new double[algoArray.length];
	static double starttime =0;
	static double stoptime=0;
	static double elapsedtime=0;
	static double conversion =100000;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Accepting array of Integer elements
		System.out.println("Enter a string");
		String str = scan.nextLine().toLowerCase();
		String[] charInput = str.split(" ");
		System.out.println("Enter string to find");
		String find = scan.nextLine().toLowerCase(); 
		System.out.println("Enter number of elements you want to enter");
		int numOfElements = scan.nextInt();
	    int []intInput = new int[numOfElements];					//Declaring int Array
		System.out.println("Enter "+numOfElements+" int elements");
		for (int i = 0; i < intInput.length; i++) {
			intInput[i]=scan.nextInt();
		}
		scan.close();
		call(intInput,charInput,find);
		sort();
		display();
	}
		
	
	public static void call(int[] intInput,String []charInput, String find) {
		String sortedArray[] = Utility.bubbleSortString(charInput);
		System.out.println("calling bubblesort for integers");
		starttime =java.lang.System.nanoTime();
		bubbleSort(intInput);
		stoptime = java.lang.System.nanoTime();
		elapsedtime =(stoptime-starttime)/conversion;
		elapsedTime[0]=elapsedtime;
		System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");;
		
		//binarySearch int
		System.out.println("calling BinarySearch for integers");
		starttime =java.lang.System.nanoTime();
		binarySearch(Utility.bubbleSort(intInput),10);
		stoptime = java.lang.System.nanoTime();
		elapsedtime =(stoptime-starttime)/conversion;
		elapsedTime[1]=elapsedtime;
		System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
		
		//insertionSort int
		System.out.println("calling insertionSort for integers");
		starttime =java.lang.System.nanoTime();
		insertionSort(intInput);
		stoptime = java.lang.System.nanoTime();
		elapsedtime =(stoptime-starttime)/conversion;
		elapsedTime[2]=elapsedtime;
		System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
		
				//bubble sort String
				System.out.println("calling bubblesort for String");
				starttime =java.lang.System.nanoTime();
				bubbleSortString(charInput);
				stoptime = java.lang.System.nanoTime();
				elapsedtime =(stoptime-starttime)/conversion;
				elapsedTime[3]=elapsedtime;
				System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
				
				//binarySearch String
				System.out.println("calling BinarySearch for String");
				starttime =java.lang.System.currentTimeMillis();
				Boolean result=binarySearchString(sortedArray, find);
				if(result)
					System.out.println("Found");
				else
					System.out.println("Not found");
				stoptime = java.lang.System.nanoTime();
				elapsedtime =(stoptime-starttime)/conversion;
				elapsedTime[4]=(float) elapsedtime;
				System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
				
				//insertionSort String
				System.out.println("calling insertionSort for String");
				starttime =java.lang.System.nanoTime();
				insertionSortString(charInput);
				stoptime = java.lang.System.nanoTime();
				elapsedtime =(stoptime-starttime)/conversion;
				elapsedTime[5]=(float) elapsedtime;
				System.out.println("Elapsed time is "+elapsedtime+" milli seconds\n");
	}
	
	private static void sort() {
		int n = elapsedTime.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (elapsedTime[j] < elapsedTime[j+1])
                {
                    // swap temp and arr[i]
                    double tempDouble = elapsedTime[j];							
                    elapsedTime[j] = elapsedTime[j+1];			
                    elapsedTime[j+1] = (float) tempDouble;				
                    
                    //for string
                    String tempStr = algoArray[j];
                    algoArray[j] =algoArray[j+1];
                    algoArray[j+1] = tempStr;
                }
            }
        }
		
	}
	

	private static void display() {
		System.out.println("\nSorting ElapsedTime in descendind order\n");
		for(int i =0;i<elapsedTime.length;i++) {
			System.out.println(algoArray[i]+" Took "+elapsedTime[i]+" millisecounds");
			System.out.println();
		}
		
	}

	}
