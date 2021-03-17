package main.java.java_3.lambda_stream;

import main.java.java_3.concurrency.Team;

public class LambdaMain {

	public static void main(String[] args) {

		//Animals*******************
		//complete the static methods on the Animals class
		//use streams wherever possible in your method implementations.

		System.out.println(Animals.capsFirst(true));
		System.out.println(Animals.capsFirst(false));
		System.out.println(Animals.getAnimals());
		System.out.println();

		System.out.println("Adding " + Animals.addAnimal("Chicken"));
		System.out.println("Adding " + Animals.addAnimal("Dog"));
		System.out.println("Adding " + Animals.addAnimal("Cat"));
		System.out.println();

		System.out.println(Animals.lowerFirst(true));
		System.out.println(Animals.lowerFirst(false));
		System.out.println(Animals.getAnimals());
		System.out.println();

		System.out.println(Animals.flipAnimals(true));
		System.out.println(Animals.flipAnimals(false));
		System.out.println(Animals.getAnimals());
		System.out.println();

		System.out.println(Animals.sortAnimals(true));
		System.out.println(Animals.sortAnimals(false));
		System.out.println(Animals.getAnimals());
		System.out.println();

		//Numbers********************
		//1. complete the static methods in the Numbers class.
		//2. solve the same challenges but allow the methods to accept lambda expressions as parameters. You could potentially create one method that can do most of the computations in the Numbers class by simply passing in a lambda expression.

			/* e.g.
			Numbers.lambdaCompute((x,y) -> x + y)) => 5661
			Numbers.lambdaCompute( (x,y) -> x - y)) => -5641
			Numbers.lambdaCompute((x,y) -> x * y)) => -1767899136
			Numbers.lambdaCompute(() -> ... ) => 2500
			etc...
			*/
		System.out.println(Numbers.getNums());
		System.out.println(Numbers.getNum(0));
		System.out.println(Numbers.isOdd(0));
		System.out.println(Numbers.isEven(4));
		System.out.println(Numbers.isPrime(3));
		System.out.println(Numbers.added());
		System.out.println(Numbers.subtracted());
		System.out.println(Numbers.multipled());
		System.out.println(Numbers.divided());
		System.out.println(Numbers.findMax());
		System.out.println(Numbers.findMin());
		System.out.println(Numbers.compare(0,1));
		System.out.println(Numbers.append(1000));
		System.out.println(Numbers.getNums());
		System.out.println();

		Numbers.lambdaCompute lambdaIsOdd = (n -> Numbers.getNum(n) % 2 != 0);
		System.out.println(lambdaIsOdd.lambdaCompute(0));

		Numbers.lambdaCompute lambdaIsEven = (n -> Numbers.getNum(n) % 2 == 0);
		System.out.println(lambdaIsEven.lambdaCompute(4));

		Numbers.lambdaCompute lambdaIsPrime = (n -> {
			if (n > Numbers.getNums().size())
			{
				System.out.println("Put valid index in. Max size of nums list is " + Numbers.getNums().size());
				return false;
			}
			if (Numbers.getNums().get(n) <= 1) {
				return false;
			}
			else {
				for (int i = 2; i < Numbers.getNums().get(n); i++)
				{
					if (Numbers.getNums().get(n) % i == 0)
					{
						return false;
					}
				}
			}
			return true;
		});
		System.out.println(lambdaIsPrime.lambdaCompute(3));

		Numbers.lambdaComputeZero lambdaAdded = () -> {
			int sum = 0;
			for (int i : Numbers.getNums())
			{
				sum+=i;
			}
			return sum;
		};
		System.out.println(lambdaAdded.lambdaCompute());

		Numbers.lambdaComputeZero lambdaSubtracted = () -> {
			int subtract = 2 * Numbers.getNums().get(0);
			for (int i : Numbers.getNums())
			{
				subtract-=i;
			}
			return subtract;
		};
		System.out.println(lambdaSubtracted.lambdaCompute());

		Numbers.lambdaComputeZero lambdaMultiplied = () -> {
			long multiplied = 1;
			for (int i : Numbers.getNums())
			{
				multiplied*=i;
			}
			if ((int) multiplied < 0) // Int overflowed
			{
				return Integer.MAX_VALUE;
			}
			return (int) multiplied;
		};
		System.out.println(lambdaMultiplied.lambdaCompute());

		Numbers.lambdaComputeZero lambdaDivided = () -> {
			int division = Numbers.getNums().get(0); // get from 1st num and divide rest. Check nums from index 1 to size
			for (int i : Numbers.getNums().subList(1, Numbers.getNums().size()))
			{
				division/=i;
			}
			// Returns 0 since dividing everything gives a very small number. Int will go to nearest whole number which is 0
			return division;
		};
		System.out.println(lambdaDivided.lambdaCompute());

		Numbers.lambdaComputeZero lambdaFindMax = () -> {
			int max = 0;
			for (int i : Numbers.getNums())
			{
				if (i > max)
				{
					max = i;
				}
			}
			return max;
		};
		System.out.println(lambdaFindMax.lambdaCompute());

		Numbers.lambdaComputeZero lambdaFindMin = () -> {
			int min = Numbers.getNums().get(0);
			for (int i : Numbers.getNums())
			{
				if (i < min)
				{
					min = i;
				}
			}
			return min;
		};
		System.out.println(lambdaFindMin.lambdaCompute());

		Numbers.lambdaComputeTwo lambdaCompare = (n, i) -> {
			if (Numbers.getNums().get(n) > Numbers.getNums().get(i))
			{
				return 1;
			}
			else if (Numbers.getNums().get(i) > Numbers.getNums().get(n)) {
				return -1;
			}
			else // They are equal
			{
				return 0;
			}
		};
		System.out.println(lambdaCompare.lambdaCompute(0,1));

		Numbers.lambdaCompute lambdaAppend = (n -> {
			Numbers.getNums().add(n);
			return n;
		});
		System.out.println(lambdaAppend.lambdaCompute(5000));
		System.out.println(Numbers.getNums());
		System.out.println();

		// Thread Team from concurrency
		Team returnSleep = new Team("ReturnSleep");
		Thread returnSleepThread = new Thread(returnSleep);
		returnSleepThread.start();
	}

}
