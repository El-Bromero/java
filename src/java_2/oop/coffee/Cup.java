package java_2.oop.coffee;

public class Cup {

/*
	Properties :
		-capacity (oz)
		-type (glass,mug,tumbler,styrofoam, etc.)
		-fluidContents (coffee,tea,lemonade,etc.)
		-fill (how much is the cup filled?  max == cup capacity)

	Methods :
		-drink(oz) - lowers the fill of the cup by how much is 'drunk'. Display a message indicating the type of coffee being consumed.
 */
	private int capacity;
	private String type;
	private String fluidContents;
	private int fill = 0;

	public Cup(int capacity, String type, String fluidContents) {
		this.capacity = capacity;
		this.type = type;
		this.fluidContents = fluidContents;

	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFluidContents() {
		return fluidContents;
	}

	public void setFluidContents(String fluidContents) {
		this.fluidContents = fluidContents;
	}

	public int getFill() {
		return fill;
	}

	public void setFill(int fill) {
		// If fill > capacity then make fill = capacity. Return so it doesn't set fill to a number > capacity
		if (fill > capacity)
		{
			this.fill = capacity;
			return;
		}
		this.fill = fill;
	}

	public void drink(int oz) {
		// capacity, fill
		if (oz > capacity)
		{
			System.out.println("Cannot drink more than the capacity of the cup! Current fill: " + fill);
			return;
		}
		else if (fill == 0)
		{
			System.out.println("Cannot drink from an empty cup!");
			return;
		}
		else if (oz > fill)
		{
			System.out.println("Cannot drink entire desired oz since fill of cup is less than oz. Desired oz: " + oz + ". Before cup fill: " + fill);
			fill = 0;
			return;
		}
		fill-= oz;
		System.out.println("Drank " + oz + " oz. Current fill of cup: " + fill);
	};
}
