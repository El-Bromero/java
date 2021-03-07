package java_2.oop.rainforest;

public class RainforestApp {

	public static void main(String[] args) {

	//	You are exploring the rainforests of the Amazon.  You have observed many different types of wildlife on your excursion.  To jog your memory,  different kinds of Rainforest Animals that you observed are found in the following URL : https://www.ietravel.com/blog/amazon-rainforest-animals-beginners-guide-21-species.  Feel free to use additional resources for more animal ideas.

	//	Pick 6 rainforest creatures and model them using the RainforestCreature class. i.e. Instantiate 6 rainforest creatures. Each Rainforest Creature should have 1 unique characteristic , and 1 unique action that it can do in addition to any general characteristics and actions that Creatures can do in general.*/

/*		Instantiate all 6 rainforest creatures here, print to the console each Rainforest Creature as a String representation, and have them perform any actions defined in the RainforestCreature class.

		ex : RainforestCreature riverDolphin = new RiverDolphin("riverDolphin","Amazon","pink",new String[]{"fish","crabs","turtles"};
			System.out.println(riverDolphin); => RiverDolphin{ properties... }.
			riverDolphin.eat() => "The river dolphin is eating fish."

		choose your own characteristics and methods to model).

*/
		/* Creatures: River Dolphin, Poison Dart Frogs, Green Anaconda, Hyacinth Macaw, Squirrel Monkey, Giant Armadillo */
		RiverDolphin riverDolphin = new RiverDolphin("9.2 ft", "River Dolphin", "pink");
		System.out.println(riverDolphin);
		riverDolphin.eat();
		riverDolphin.swim();
		System.out.println();

		PoisonDartFrog poisonDartFrog = new PoisonDartFrog("2 in", "Poison Dart Frog", true);
		System.out.println(poisonDartFrog);
		poisonDartFrog.eat();
		poisonDartFrog.secretePoison();
		System.out.println();

		GreenAnaconda greenAnaconda = new GreenAnaconda("16 ft", "Green Anaconda", "slither");
		System.out.println(greenAnaconda);
		greenAnaconda.eat();
		greenAnaconda.suffocate();
		System.out.println();

		HyacinthMacaw hyacinthMacaw = new HyacinthMacaw("3.3 ft", "Hyacinth Macaw", "hooked beak");
		System.out.println(hyacinthMacaw);
		hyacinthMacaw.eat();
		hyacinthMacaw.fly();
		System.out.println();

		SquirrelMonkey squirrelMonkey = new SquirrelMonkey("14 in", "Squirrel Monkey", "black and white");
		System.out.println(squirrelMonkey);
		squirrelMonkey.eat();
		squirrelMonkey.climb();
		System.out.println();

		GiantArmadillo giantArmadillo = new GiantArmadillo("3.3 ft", "Giant Armadillo", "armor-plate");
		System.out.println(giantArmadillo);
		giantArmadillo.eat();
		giantArmadillo.dig();

	}

}
