package java_3.serial;

import java.io.*;

public class Fax {

/*	Properties :
		brand
		model
		year

	Methods :
		transmit(message)
		receive(message)

 */
	private String brand;
	private String model;
	private String year;

	public Fax(String brand, String model, String year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getYear() {
		return year;
	}

	public void transmit(Message msg) throws IOException {
		//The transmit message must serialize a Message, and write it to a file.
		FileOutputStream fos = new FileOutputStream("serial.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(msg);
		fos.close();
		oos.close();

	}

	public Message receive(String filename) throws IOException, ClassNotFoundException {
//		The receive method should deserialize a message by reading it in from a file. and then print it to the console.
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		fis.close();
		ois.close();
		System.out.println(obj);
		return (Message) obj;
	}

	@Override
	public String toString() {
		return "Fax{" +
				"brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", year='" + year + '\'' +
				'}';
	}
}
