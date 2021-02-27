package java_1.dataTypes;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class

		printMsg("Hello World!", 5);

		System.out.println(nthFibonacci(10));

		// Doing printf since it formats decimals to 2 places. Added empty println since printf prints on 1 line and doesn't add a new line at the end
		System.out.printf("calcPay: %.2f", calcPay(12,50, 4));
		System.out.println();

		System.out.println(countQuarters(10.75));

		System.out.println(reverseString("Hello World"));

		printEgg();

		Item item1 = new Item("stuff", 1000);
		System.out.println(item1.toString());
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

		//return 0.0d;
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */
		return x;
	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		double convertAmount = amount / 0.25;
		int numQuarter = (int) convertAmount;
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
		//return str;
	}

	static String shuffleMessage(String[] messages) {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		return null;
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
		return 4.0;
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
		// Adding "\" to \s and "
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
		return 0.0;

	}
}