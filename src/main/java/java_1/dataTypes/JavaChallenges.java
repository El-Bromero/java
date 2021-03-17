package main.java.java_1.dataTypes;

// Importing these libraries for the randomized message exercise
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class

		printMsg("Hello World!", 5);

		System.out.println("Fibonacci: " + nthFibonacci(10));

		// Doing printf since it formats decimals to 2 places. Added empty println since printf prints on 1 line and doesn't add a new line at the end
		System.out.printf("calcPay: %.2f", calcPay(12,50, 4));
		System.out.println();

		System.out.println("Quadratic equation: " + solveQuadratic(5, 3, 10));

		System.out.println("Count quarters: " + countQuarters(10.75));

		System.out.println(reverseString("Hello World"));

		String[] msg = {"hi", "dear", "friend", "how", "are", "you"};
		System.out.println(shuffleMessage(msg));

		int[] grades = {60, 20, 100, 95, 92, 87, 60, 77};
		System.out.println("GPA is: " + calcGPA(grades));

		printEgg();

		Item item1 = new Item("stuff", 1000);
		Item item2 = new Item("things", 200);
		Item item3 = new Item("Loch Ness Monster", 20.50);
		Item[] items = {item1, item2, item3};
		System.out.println("Total receipt of all items is: " + totaledReceipt(items));
	}

	static void printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		for(int i = 0; i < repeats; i++)
		{
			System.out.println(msg);
		}
	}

	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */

		// I know we haven't learned recursion but this was easier for me to do than to do a for loop calculating total fib number
		if(n >= 3)
		{
			return (nthFibonacci(n-1) + nthFibonacci(n-2));
		}
		return 1;
	}

	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		return (hrsPerPeriod * hourlyRate * payPeriods);
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */
		// There is a quadratic formula but it doesn't help here. Seeing how we are getting the 3 values I will just add them and return that
		// This solveQuadratic exercise confused me
		System.out.println("x = " + x + " | y = " + y + " | z = " + z);
		return x * x + y + z;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		double convertAmount = amount / 0.25;
		int numQuarter = (int) convertAmount;
		System.out.println(amount + " being converted to quarters");
		return numQuarter;
	}

	static String reverseString(String str) {
		//reverse the input string and return it.
		char charStr[] = str.toCharArray();
		char reverseStr[] = new char[charStr.length];

		int j = 0;
		for (int i = str.length()-1; i >= 0; i--)
		{
			reverseStr[j] = charStr[i];
			j++;
		}
		return String.valueOf(reverseStr);
	}

	static String shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		// This converts string array messages to List and uses Collections.shuffle to randomize the data in messages. Convert back to array
		List<String> stringList = Arrays.asList(messages);
		Collections.shuffle(stringList);
		stringList.toArray(messages);

		String shuffledMsg = "";
		for (String i : messages)
		{
			shuffledMsg += i + " ";
		}

		return shuffledMsg;
	}

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		double[] gpa = new double[scores.length];

		int index = 0;
		for (int i : scores)
		{
			if (i >= 0 && i <= 59)
			{
				gpa[index] = 0.0;
			}
			else if (i >= 60 && i <= 69)
			{
				gpa[index] = 1.0;
			}
			else if (i >= 70 && i <= 79)
			{
				gpa[index] = 2.0;
			}
			else if (i >= 80 && i <= 89)
			{
				gpa[index] = 3.0;
			}
			else if (i >= 90 && i <= 100)
			{
				gpa[index] = 4.0;
			}
			index++;
		}
		double avgGPA = 0.0;
		for (double i : gpa)
		{
			avgGPA += i;
		}
		avgGPA = avgGPA / gpa.length;
		return avgGPA;
	}

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
		// Adding "\" to \ and "
		System.out.println("  _______  ");
		System.out.println(" /       \\ ");
		System.out.println("/         \\");
		System.out.println("-\"-'-\"-'-\"-");
		System.out.println("\\         /");
		System.out.println(" \\_______/");
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

	static double totaledReceipt(Item[] transactions) {

		//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
		//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
		double total = 0.0;
		for(Item i : transactions)
		{
			total += i.cost;
		}
		return total;

	}
}