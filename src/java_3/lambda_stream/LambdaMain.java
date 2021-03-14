package java_3.lambda_stream;

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
	}

}
