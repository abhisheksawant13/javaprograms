package com.bridgelabz.dsPrograms;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) throws Exception {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		if(Integer.toString(year).length()!=4) {
			throw new Exception("Enter a valid year");
		}
		else if(month<1||month>12) {
			throw new Exception("Enter a valid month");
		}
		else {
			Utility.calanderGenerator(month,year);
		}
	}

}
