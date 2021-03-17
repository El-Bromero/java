package main.java.java_1.dataTypes;

import java.util.Arrays;

class DataTypes {

		int number = 2021;
		int yearOfBirth = 1977;
		int nums[] = {3,4,5,6,7,8,10,12};
		String movieName = "Meet The Parents";
		char male = 'm';
		long triplet = 3L;
		char female = 'f';
		float decimalVal = .0000000000001f;
		byte halfByte = 0101;


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		DataTypes data = new DataTypes();
		System.out.println(data.number);
		System.out.println(data.yearOfBirth);
		for (int i: data.nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(data.movieName);
		System.out.println(data.male);
		System.out.println(data.triplet);
		System.out.println(data.female);
		System.out.println(data.decimalVal);
		System.out.println(data.halfByte);


		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs
		System.out.println(data.yearsToMonths(10));
		System.out.println(data.monthsToHours(3));
		System.out.println(data.daysToSeconds(5));
		System.out.println(data.centuriesToSeconds(1));
		System.out.println(data.dollarsToBitcoin(10000));
		System.out.println(data.canDrive(10));
		// Using Arrays library for the toString method. Imported the library above
		System.out.println(Arrays.toString(data.getDataTypes(15, false, 1000000001)));
	}

	int yearsToMonths(int years) {
		//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
		int months = 12;
		System.out.println(years + " years in number of months is " + years * months);
		return (years * months);
	}

	int monthsToHours(int months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours
		int days = 30; // Putting 30 as average amount of days in a month
		int hours = 24;
		System.out.println(months + " months in number of hours is " + (months * days * hours));
		return (months * days * hours);
	}

	int daysToSeconds(int days) {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 years => 17520 hours
		int hours = 24;
		int minutes = 60;
		int seconds = 60;
		System.out.println(days + " days in number of seconds is " + (days * hours * minutes * seconds));
		return (days * hours * minutes * seconds);
	}

	long centuriesToSeconds(int centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds
		int years = 100;
		int days = 365;
		int hours = 24;
		int minutes = 60;
		int seconds = 60;
		long centuriesToSecs = centuries * years * days * hours * minutes;
		// I am not multiplying all in one line since including seconds above would make value negative/overflow
		centuriesToSecs = centuriesToSecs * seconds;
		System.out.println(centuries + " centuries in number of seconds is " + centuriesToSecs);
		return centuriesToSecs;
	}

	float dollarsToBitcoin(double dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars  3.1556952 x 10^9 Seconds
		// Going to be using 1 bitcoin = $35,000 dollars since bitcoin is very volatile
		int bitcoin = 35000;
		float dollarToBitcoin = (float) (dollars / bitcoin);
		System.out.println(dollars + " dollars in bitcoin is " + dollarToBitcoin);
		return dollarToBitcoin;
	}

	boolean canDrive(int age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		boolean oldEnough;
		if (age >= 15)
		{
			System.out.println("Person aged " + age + " is ready to drive");
			return true;
		}
		else
		{
			System.out.println("Person aged " + age + " is not ready to drive");
			return false;
		}
	}

	String[] getDataTypes(int num1, boolean bool1, long long1) {
//		Use Java to get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.  Do NOT hard code the answers here.  Make sure to use Java to programmatically get the data types.
		String num = Integer.toString(num1);
		String bool = Boolean.toString(bool1);
		String longString = Long.toString(long1);
		return new String[]{num, bool, longString};
	}

}