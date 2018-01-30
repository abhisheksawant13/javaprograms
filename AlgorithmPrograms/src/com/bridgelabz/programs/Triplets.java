/****************************************************************************** 
 *  Purpose: Finding Distinct triplets whose sum iseqaul to zero
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   22-01-2017
 *
 ******************************************************************************/


package com.bridgelabz.programs;
/*
* Finding Distinct triplets whose sum iseqaul to zero.
*/
public class Triplets{
	public static void main(String args[]) {
		int []array = {1,-2,-3,-4,5,6,7,8,-9,-5};
		distinctTriplets(array);                             //passing array to Triplet function

	}
	
	public static void distinctTriplets(int[] arr){
		int count=0;

		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						count++;	
						System.out.println("triplets found at location : "+i+" "+j+" "+k);
						System.out.println("Addition of triplets  : ("+arr[i]+")+("+arr[j]+")+("+arr[k]+") =0");
					}

				}

			}

		}
		System.out.println("total triplets found : "+count);
}
}
