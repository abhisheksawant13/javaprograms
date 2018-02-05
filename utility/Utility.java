/****************************************************************************** 
 *  Purpose:Utility Class Containing various Methods
 *
 *  @author  Abhishek Sawant
 *  @version 1.0
 *  @since   25-01-2018
 *
 ******************************************************************************/
package com.bridgelabz.utility;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.bridgelabz.utility.People;

public class Utility {
	private static int Cash = 100000;
	static Scanner scanner;
	//private static LinkedList<Integer> list = new LinkedList<Integer>();
	//private static LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	
	public Utility() {
		scanner = new Scanner(System.in);
	}

	public static String getString() {
		return scanner.nextLine();
	}
	public static String getStringSingle() {
		return scanner.next();
	}
	public int getInteger() {
		return scanner.nextInt();
	}

	public double getDouble() {
		return scanner.nextDouble();
	}

	public boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public float getFloat() {
		return scanner.nextFloat();
	}
	
	/**
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		int count = 0;
	
		for(int i=1;i<=number;i++){
 			if((number % i) == 0)                                          
   				 count++;
        		} 

        		if(count == 2)
           			return true;
        		else                                                    
           		return false;
   	}
	public static int[] primeNumbers(int high){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<=high;i++) {
			if(isPrime(i)) {
			list.add(Integer.valueOf(i));
		}
		}
		int []primeArray =new int[list.size()];
		for(int i =0;i<primeArray.length;i++) {
			primeArray[i]=list.get(i).intValue();
		}
		return primeArray;
		
	}
	/*
	 * @param string1
	 * 
	 * @param string2
	 * 
	 * @logic to find two string are anagram or not
	 */
	
	public static boolean checkAnagarm(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2) {
			return false;
		} 
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		// sort array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	
	/**
	 * @param s
	 * @return returns true or false for a string
	 */
	public static boolean palindrome(String s) {
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		for (int i = 0; i < length; i++) 
		{
			if (charArray[i] != charArray[length - 1 - i])
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param number
	 * @return
	 */
	public static boolean isPalindrome(int number)
	{
		int n = number;
		int m = n;
		int a=0,x=0;  //temp variables
		 while(n > 0)
	        {
	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	        }
	        if(a == m)
	        {
	            return true;
	        }
	        else
	        {
	        	return false;
	        }
			
	}
	/**
	 * @param date
	 * @param month
	 * @param year
	 */
	public static void dayCalculation(int date,int month,int year) {

		//Calculates the year
		int y = year - (14 - month)/12;

		//Checks for leap Year
		int x = y + (y/4) - (y/100) + (y/400);

		//Checks for month
		int m = month + 12 * ((14 - month) / 12) - 2;

		//Checks the value associated with Day i.e from 0 to 6 
		int day = (date + x + (31 * m)/12)%7;

		calculate(day);

	}
	
	/*
	 * Function to check if Anagram
	 */
		@SuppressWarnings("unused")
		public static boolean isAnagram(char[] strArr1, char[] strArr2) {
			int count = 0;
			for(int i =0;i<strArr1.length;i++) {
				if(strArr1[i]==strArr2[i])
					count = 1;
				else
					count = 0;
					break;
			}
		    if(count == 1)
		      return true;
	        else
	          return false;
	}
		
	/*
	 * Function to modify String
	 */
		public static char[] stringModifier(String str1) {
			char temp;
			String tempStr1 = str1.replaceAll("\\s","").toLowerCase(); 
			char[] tempChar = tempStr1.toCharArray();	//Conversion of string to char array
			
			//Sorting the array
			for(int i = 0;i<tempChar.length;i++) {
				for(int j = i+1;j<tempChar.length-1;j++) {
					if(tempChar[i]>tempChar[j]) {
						temp = tempChar[i];
						tempChar[i]=tempChar[j];
						tempChar[j]=temp;
					}
				}
			}
	 		return tempChar;
		}
	/*
	 * Display Day Taking the number for day as Input
	 */
	public static void calculate( int number) {
        //Prints the day
        if (number == 1)
		System.out.println("The day is Monday");

	    else if (number == 2)
		System.out.println("The day is Tuesday");

	    else if (number == 3)
		System.out.println("The day is Wednesday");

	    else if (number == 4)
		System.out.println("The day is Thrusday");

	    else if (number == 5)
		System.out.println("The day is Friday");

	    else if (number == 6)
		System.out.println("The day is Saturday");

	    else
		System.out.println("The day is Sunday");
	}
	
	   /**
	 * @param mTemperatureFarenheit
	 * @return
	 */
	public static double temperatureConversion(double mTemperatureFarenheit) {
 
       //formula for temperature conversion from farenheit to celcius
       double mTemperatureConverted = ((mTemperatureFarenheit - 32) / 1.8);
       return mTemperatureConverted;
	}
	   
	   /*
	    * Squareroot of a number
	    */
	   public static double sqrt(double c) {
			 double epsilon = 1e-15;	//Default Epsilon Value
			 double t = c;   			//Given Condition       
			 while (Math.abs(t - c/t) > epsilon*t) {	//Given condition
		            t = (c/t + t) / 2.0;
		        }
			 return t;
		    }
	   
	/**
	 * @param decimalNo
	 * @param size
	 * @return
	 */
	public static int[] toBinary(int decimalNo, int size) {
		int num = decimalNo;
		int binary[] = new int[size];
		int j = size - 1;
		while (num > 0) {
			binary[j--] = num % 2;
			num = num / 2;
		}
		return binary;
	}
	
	/**
	 * @param binaryNumber
	 * @return
	 */
	public static int swapNibble(int []binaryNumber) {
		int temp=0;
		for(int i =0,j=4;i<4;i++,j++) {
			temp = binaryNumber[i];
			binaryNumber[i]=binaryNumber[j];
			binaryNumber[j]=temp;
		}
		int decimalNumber=0;
		int k=0;
		for(int i=binaryNumber.length-1;i>=0;i--) {
			if(binaryNumber[i]==1) {
				decimalNumber +=Math.pow(2, k);
				
			}
			k++;
		}
		return decimalNumber;
	}
	
	/**
	 * @param integerArray
	 * @return
	 */
	public static int[] bubbleSort(int[] integerArray) {
		int n = integerArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (integerArray[j] > integerArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                }
		return integerArray;
}
	
	/**
	 * @param strArr
	 * @return
	 */
	public static String[] bubbleSortString(String[] stringArray) {
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
		return stringArray;
}


	/**
	 * @param principal = princliple amount
	 * @param rate = rate of intrest	
	 * @param years = no of years
	 * @return
	 */
	public static double monthlyPayment(float principal,float rate,float years)
	{	
		float n = 12 * years;
		float r = rate / (12*100);
		double x = Math.pow(1+r,(-n));	
		
		double payment = ((principal*r) / (1-x));
		return payment;
}

	/**
	 * @param limit
	 * @return
	 */
	public static String[] checkPrime(int limit)
	{
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i < limit; i++) //limit  times
		{
			boolean isPrime = true;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime) 
			{
				array[position] = String.valueOf(i);//index ibvalue to string
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) 
		{
			array1[k] = array[k];
		}
		return array1;
	}
	
	/**
	 * @param sortedArray
	 * @param find
	 * @return
	 */
	public static boolean binarySearch(int[] sortedArray, int find) {
		int first =0;
		int last = sortedArray.length-1;
		int middle=(first+last)/2;
		while(first<=last) {
			if(sortedArray[middle]<find) {
				first=middle+1;
			}
			else if (sortedArray[middle]==find) {
				return true;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		return false;
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

	public static void displayStringArray(String[] inputString) {
			for(int i =0;i<inputString.length;i++) {
				System.out.print(inputString[i]+" ");
			}
		
	}
    public static String[] mergeSort(String[] string) {
        if (string.length >= 2) {
            String[] left = new String[string.length / 2];
            String[] right = new String[string.length - string.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = string[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = string[i + string.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(string, left, right);
        }
		return string;
    }

    public static void merge(String[] string, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < string.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareTo(right[b]) < 0)) {
                string[i] = left[a];
                a++;
            } else {
                string[i] = right[b];
                b++;
            }
        }
    }
    
    
    public static void twoDMatrix(int[] primeArray) throws Exception{
		int array[] =primeArray;
		int[][] arrayTwoD = new int[10][50];
		int k =-1;
		int multiple =0;
		for(int i =0;i<10;i++) {
			k++;
			multiple++;
			for(int j=0;j<array.length-1;j++) {
					arrayTwoD[i][j]=array[k];
					if(arrayTwoD[i][j]<array[array.length-1]) {
					if((array[k]>=100*multiple)) {
						System.out.println();
						arrayTwoD[i][j]=primeArray[k];
						System.out.print(" "+arrayTwoD[i][j]);
						break;
					}
					System.out.print(" "+arrayTwoD[i][j]);
					k++;
			}
				else
					break;
		}
			}
}
    
	public static void unOrderedList(String[] string, String choice, String source) throws IOException {
		LinkedList<String> list = new LinkedList<String>();
		for(int i =0;i<string.length;i++) {
			list.add(string[i]);
		}
		if(list.contains(choice)) {
			System.out.println("Found the entered string: Now Removing "+choice);
			list.remove(choice);
		}
		else {
			System.out.println("ITEM NOT FOUND: Adding "+choice+" at last");
			list.add(choice);
		}
		System.out.println("Added to the List\n");
		list.show();
		String []string1 =list.returnCharArray();
		System.out.print(string1);
		//Write to file
		FileWriter writer=new FileWriter("/home/bridgeit/Desktop/example.txt");  
		BufferedWriter bufferwriter = new BufferedWriter(writer);
		for(int i=0; i<string1.length;i++){
		bufferwriter.write(string1[i]+" ");
		}
		bufferwriter.flush();
		bufferwriter.close();
		System.out.println("\nelements added to list");
	}

	public static void orderedList(int[] array, int choice, String source) throws IOException {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i =0;i<array.length;i++) {
			list.add(array[i]);
		}
		if(list.contains(choice)) {
			System.out.println("Found the entered string: Now Removing "+choice);
			list.remove(choice);
		}
		else {
			System.out.println("ITEM NOT FOUND: Adding "+choice+" at last");
			list.add(choice);
			System.out.println("Added to the List\n");
		}
		//list.show();
		int []integerList = list.returnIntArray();
		System.out.println("Sorted Array is ");
		int sortedArray[] = bubbleSort(integerList);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(" "+sortedArray[i]);
		}
		addToFile(sortedArray, source);
	}
	
	public static void addToFile(int []sortedArray,String source) throws IOException {
		FileWriter writer=new FileWriter(source);  
		BufferedWriter bufferwriter = new BufferedWriter(writer);
		for(int i=0; i<sortedArray.length;i++){
		bufferwriter.write(sortedArray[i]+" ");
		}
		bufferwriter.flush();
		bufferwriter.close();
		System.out.println("elements added to list");
	}

	public static boolean balancedParenthesis(char[] expressionArray) throws Exception {
		Stack<Character> stack = new Stack<Character>(expressionArray.length);
		//int stacksize=0;
		//method to solve the testcase
		for (int j = 0; j < expressionArray.length; j++) {
			if(expressionArray[j]=='(') {
				stack.push('(');
				//stacksize++;
			}
			else if(expressionArray[j]==')') {
				//stacksize--;
				stack.pop();
			}
		}
		return stack.isStackEmpty();
	}

	public static boolean ispalindromeCheckerDs(String inputString) {
		Queue<Character> queue = new Queue<Character>();
		boolean value = false;
		char []inputCharacters = inputString.toCharArray();
		
		//enquing characters to the queue
		for(int i = 0;i<inputCharacters.length;i++) {
			queue.enqueue(inputCharacters[i]);
		}
		
		//dequing the queue to check the value
		for(int i =inputCharacters.length-1;i>=0;i--) {
			char check = queue.dequeue();
			if(inputCharacters[i]!=check) {
				value= false;
				break;
			}
			else {
				value =true;
			}
		}
		return value;
	}

	public static void twoDArrayList() {
		//Creating 2D list
		ArrayList<ArrayList<Integer>> twoDList = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<10;i++) {
			twoDList.add(new ArrayList<Integer>());
		}
		//getting prime numbers
		int []primeArray = new int[1000];
		int k = 0;
		for(int i =0;i<1000;i++) {
			if(isPrime(i)) {
				primeArray[k++]=i;
		}
		}
	    //Adding Prime Numbers to the List
		int multiple =0;
		int j;
		int l=0;
		for(int i = 0;i<10;i++) {
			multiple++;
			for(j=l;j<primeArray.length;j++) {
				twoDList.get(i).add(primeArray[j]);
				if(primeArray[j]>=100*multiple) {
					l=j;
					break;
				}
			}
			l=j;
			j++;
		}
		//Displaying 2D Array
		for(int i=0;i<10;i++) {
			for(j =0;j<twoDList.get(i).size();j++) {
				if(twoDList.get(i).get(j)==primeArray[primeArray.length-1]) {
					break;
				}
				System.out.print(" "+twoDList.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void primeAnagaramDs() {
		//Accepting prime numbers as String
		String[]primeArray = checkPrime(1000);
		ArrayList<ArrayList<String>> anagramList = new ArrayList<ArrayList<String>>();
		for(int i = 0;i<2;i++) {
			anagramList.add(new ArrayList<String>());
		}
		//Adding Anagram to the ArrayList
		 for (int i = 0; i < primeArray.length; i++) 
	        {
				for (int j = i + 1; j < primeArray.length; j++) 
				{
					if (Utility.checkAnagarm(primeArray[i], primeArray[j]))
					{
						anagramList.get(0).add(primeArray[i]);
						anagramList.get(0).add(primeArray[j]);
					}
				else {
						anagramList.get(1).add(primeArray[j]);
				}
			}
	        }
		
		//Displaying 2D Array
			for(int i=0;i<2;i++) {
				for(int j =0;j<anagramList.get(i).size();j++) {
					/*if(anagramList.get(i).get(j)==primeArray[primeArray.length-1]) {
						break;*/
					System.out.print(" "+anagramList.get(i).get(j));
				}
				System.out.println();
			}
		}
/*----------------------------------------------------------------------------------------------*/
	public static void stackAnagram() throws Exception {
		String[]primeArray = checkPrime(1000)
				;
		//Saving anagrams that are Prime number
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < primeArray.length; i++) {
			for (int j = i + 1; j < primeArray.length; j++) {
				if (Utility.checkAnagarm(primeArray[i], primeArray[j])) {
					list.add(primeArray[i]);
					list.add(primeArray[j]);
				}
			}
        }
		Stack<String> stack =new Stack<String>(list.size());
		for (int i = 0; i < list.size(); i++) {
			stack.push(list.get(i));
		}
		for (int i = 0; i < list.size()/2; i++) {
			System.out.print(" "+stack.pop());
		}
	}
/*----------------------------------------------------------------------------------------------*/
	public static void queueAnagram() {
		String[]primeArray = checkPrime(1000)
				;
		//Saving anagrams that are Prime number
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < primeArray.length; i++) {
			for (int j = i + 1; j < primeArray.length; j++) {
				if (Utility.checkAnagarm(primeArray[i], primeArray[j])) {
					list.add(primeArray[i]);
					list.add(primeArray[j]);
				}
			}
        }
		Queue<String> queue =new Queue<String>();
		for (int i = 0; i < list.size(); i++) {
			queue.enqueue(list.get(i));
		}
		for (int i = 0; i < list.size()/2; i++) {
			System.out.println(" "+queue.dequeue()+" "+queue.dequeue());
		}
	}

	public static void bankingCashCounter(int numberOfPeople) throws Exception {
		class People {
			String name;
			double balance; 
			public People(String Name,double balance2) {
				this.name=Name;
				this.balance=balance2;
				
			}
		}
		Queue<People> queue = new Queue<People>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double bankBalance = Cash;
		//Counter enquing people
		for(int i =0;i<numberOfPeople;i++) {
			System.out.println("Customer "+(i+1)+"Enter Following Details");
			System.out.println("Enter your Name");
			String name = scanner.next();
			System.out.println();
			System.out.println("Enter your Balance");
			double balance = scanner.nextDouble();
			queue.enqueue(new People(name,balance));	
		}
		
		//Service
		for(int i =0;i<queue.size();) {
			double personsBalance = queue.getAtPosition(i).balance;
			String personsName =queue.getAtPosition(i).name;
			System.out.println("Welcome "+personsName+ " What Service Do You Prefer");
			System.out.println("1.Withdarw\n2.Deposit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println(personsName+" Enter the Amount you Want to withdraw");
				double toWithdraw = scanner.nextInt();
				if(personsBalance<toWithdraw) {
					System.out.println("Sorry "+personsName+" You dont have Enough Balance");
				}
				else if(toWithdraw>bankBalance) {
					System.out.println("Sorry "+personsName+" Bank DoesNot have Sufficient Fund for your Withdrawl");
				}
				else {
					bankBalance -=toWithdraw;
					personsBalance -=toWithdraw;
					System.out.println("Transaction successful ");
					System.out.println("Your Current Balance is "+personsBalance);
				}
				queue.dequeue();
				break;
			case 2:
				System.out.println(personsName+" Enter the Amount you Want to Deposit");
				double toDeposit = scanner.nextInt();
					if(toDeposit<0) {
						System.out.println("Enter a valid amount to deposit");
					}
					else {
					bankBalance +=toDeposit;
					personsBalance +=toDeposit;
					System.out.println("Transaction successful ");
					System.out.println("Your Current Balance is "+personsBalance);
				}
				queue.dequeue();
			}
			
		}
	}
}
/*----------------------------------------------------------------------------------------------*/

	/*public static void bankingCashCounter(int numberOfPeople) {
		Queue<Integer> queue = new Queue<Integer>();
		int availableBalance=Cash;
		int choice;
		for(int  i=0;i<numberOfPeople;i++) {
			System.out.println("Person No"+i+"\n What do you want to do? :Withdraw or Deposit\nFor Withdraw Press 1\nDeposit press 2");
				choice =scanner.nextInt();
				if(choice!=1||choice!=2) {
					System.out.println("Sorry Choose a Valid Action : Choose Again");
					i--;
				}
				if(choice==1||choice==2) {
					switch (choice) {
					case 1:
						System.out.println("Enter The Amount You want to withdraw");
						int amountToWithdraw =scanner.nextInt();
						if(amountToWithdraw<Cash) {
							queue
						}
					}
				}
		}
	}*/