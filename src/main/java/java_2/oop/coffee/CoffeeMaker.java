package java_2.oop.coffee;

class CoffeeMaker extends Machine {
//	In addition to the functions of any Machine, the CoffeeMachine also has an ability to brew coffee.

	/*
		Properties :
			-brand (coffee machine brand)
			-type (drip, cold brew, espresso, stove top etc.)
			-on (if the Coffee Maker is powered on or not)

		Methods :
			-brew(CoffeeBean, Cup);
			-Any additional functions of a machine. (Use the Machine abstraction for this CoffeeMaker).
 	*/
	private final String brand;
	private boolean on = false;

	public CoffeeMaker(String type, String brand) {
		super(type);
		this.brand = brand;
	}

	Cup brew(CoffeeBeans coffee, Cup cup) {

		/*
			if the Coffee Maker is not powered on, do not brew any coffee.
			check if the coffee has been roasted or not.  If the coffee bean hasn't been roasted, throw an exception or print an error message to the console, indicating the beans must be roasted before brewing.

			also check if the cup is full or empty.  if it's full, indicate to the user to insert an empty cup.

			mark the coffee as being brewed, and fill the cup to capacity.  return the Cup to the user.
		*/
		if (!isOn())
		{
			System.out.println("Coffee Maker is not on!");
			return cup;
		}
		if (!coffee.isRoasted())
		{
			System.out.println("Coffee bean has not been roasted yet. Beans must be roasted before brewing");
			return cup;
		}
		if (cup.getFill() == cup.getCapacity())
		{
			System.out.println("Cup is full. Please insert an empty cup");
			return cup;
		}
		System.out.println("Successful brew of " + coffee.getBeanName());
		coffee.setBrewed(true);
		cup.setFill(cup.getCapacity());
		return cup;
	}

	@Override
	public void powerOn() {
		on = true;
	}

	@Override
	public void powerOff() {
		on = false;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isOn() {
		return on;
	}

	@Override
	public String toString() {
		return "CoffeeMaker{" +
				"type='" + getType() + '\'' +
				"brand='" + brand + '\'' +
				", on=" + on +
				'}';
	}
}
