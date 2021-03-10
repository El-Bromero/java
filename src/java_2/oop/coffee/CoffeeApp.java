package java_2.oop.coffee;

public class CoffeeApp {

	public static void main(String[] args) {
/*
	- Create 4 different CoffeeBean (instances) (Java, Kona, Geisha, etc.)
	- Create 4 different cups for the brewed coffee
	- Create at least 1 CoffeeMaker to brew the Coffee.
	- Brew Coffee in the Coffee Maker and fill the four cups with different types of Coffee.
	-
 */
		// Create 4 different CoffeeBean (instances) (Java, Kona, Geisha, etc.)
		CoffeeBeans java = new CoffeeBeans("Java", "Java", "Buttery brew");
		CoffeeBeans kona = new CoffeeBeans("Hawaiian Kona", "Hawaii", "Sweet herbs and floral...");
		CoffeeBeans blueMountain = new CoffeeBeans("Blue Mountain", "Jamaica", "Sweet herbs and floral...");
		CoffeeBeans kenyanAA = new CoffeeBeans("Kenyan AA", "Kenya", "Sweet fruit notes, a wine-y acidity...");

		// Create 4 different cups for the brewed coffee
		Cup mug = new Cup(16, "mug", "coffee");
		Cup glass = new Cup(24, "glass", "coffee");
		Cup tumbler = new Cup(32, "tumbler", "coffee");
		Cup styrofoam = new Cup(8, "styrofoam", "coffee");

		// Create at least 1 CoffeeMaker to brew the Coffee. (I don't know much about coffee making so I am going to stick with 1 coffee maker :) )
		CoffeeMaker keureg = new CoffeeMaker("brew", "Keureg");
		keureg.powerOn();

		// Brew Coffee in the Coffee Maker and fill the four cups with different types of Coffee.
		java.setRoasted(true);
		mug = keureg.brew(java,mug);
		mug.drink(8);
		System.out.println();

		kona.setRoasted(true);
		glass = keureg.brew(kona,glass);
		glass.drink(13);
		System.out.println();

		blueMountain.setRoasted(true);
		tumbler = keureg.brew(blueMountain,tumbler);
		tumbler.drink(16);
		System.out.println();

		kenyanAA.setRoasted(true);
		styrofoam = keureg.brew(kenyanAA,styrofoam);
		styrofoam.drink(8);

		keureg.powerOff();
	}
}
