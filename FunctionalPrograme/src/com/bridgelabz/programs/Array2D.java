/****************************************************************************** 
 *  Purpose: 2DArray
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   23-01-2018
 *
 ******************************************************************************/
 
 /*
 *2DArray 
 */
package com.bridgelabz.programs;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Rows and Columns");
			int rows = scanner.nextInt();	
			int cols = scanner.nextInt(); 
			System.out.println("Enter Your Choice /n 1 for Integer /n 2 for Float /n 3 for Double");	
			int choice = scanner.nextInt();
			switch (choice) {
				case 1 :
						int[][] intArray = new int[rows][cols];
						System.out.println("Enter Array Elements:");
						for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								intArray[i][j] = scanner.nextInt();
							}
						}
						System.out.println();
						arrayTwoD(intArray, rows, cols);
						//printArray(intArray);
						/*for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.print(" "+intArray[i][j]);
							}
						System.out.println("");
						}
						//printArray(intArray);
						break;*/
				
				case 2 :
					float[][] floatArray = new float[rows][cols];
					System.out.println("Enter Array Elements:");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							floatArray[i][j] = scanner.nextFloat();
						}
					}
					System.out.println();
					for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.println(" "+floatArray[i][j]);
							}
						System.out.println("");
						}
					break;//printArray(floatArray);
					
				case 3 :
					double[][] doubleArray = new double[rows][cols];
					System.out.println("Enter Array Elements:");
					for(int i=0;i<rows;i++)
					{
						for(int j=0;j<cols;j++)
						{
							doubleArray[i][j] = scanner.nextDouble();
						}
					}
					System.out.println();
					for(int i=0;i<rows;i++)
						{
							for(int j=0;j<cols;j++)
							{
								System.out.print(" "+doubleArray[i][j]);
							}
						System.out.println("");
						}
						//printArray(intArray);
						break;
			}
}
	public static <T extends Comparable<T>> void arrayTwoD(T[][]array,T rows, T cols) {
					T row = rows;
					T col = cols;
			        T max = array[(int) row][(int) col];
			       for(int i=0;i<(int)rows;i++) {
			    	   for(int j=0;j<(int)rows;i++) {
			    		   System.out.println(array[i][j]);
			    	   }
			       }
			    }
}

