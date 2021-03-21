package java_2.oop.monkey;

public class MonkeyApp {

	public static void main(String[] args) {
        /*
        - Add 3 monkeys to the MonkeyCage, utilizing the inner Monkey class and the addMonkey() method
        - Determine whether the majority of them are smiling or not.  write your code in the areMonkeySmiling(arr) method

        example :
        [Rafiqi (smiling), Curious George (smiling), King Kong (not smiling)] => areMonkeysSmiling(arr) => true

        You are NOT allowed to move the Monkey class outside of the MonkeyCage class.  Keep it exactly where it is.
        */

		MonkeyCage cage = new MonkeyCage();

		MonkeyCage.Monkey rafiqi = cage.new Monkey("Rafiki", true);
		MonkeyCage.Monkey george = cage.new Monkey("Curious George", true);
		MonkeyCage.Monkey kingKong = cage.new Monkey("King Kong", false);

		cage.addMonkey(rafiqi);
		cage.addMonkey(george);
		cage.addMonkey(kingKong);

		System.out.println(cage.areMonkeysSmiling(new MonkeyCage.Monkey[]{rafiqi, george, kingKong}));

	}
}
