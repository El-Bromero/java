package main.java.java_2.oop.coffee;

public abstract class Machine {
	private final String type;
	private String brand;
	private boolean on;

	protected Machine(String type) {
		this.type = type;
	}

	protected String getType() {
		return type;
	}

	public abstract void powerOn();
	public abstract void powerOff();
}
