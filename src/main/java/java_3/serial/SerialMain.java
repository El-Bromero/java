package main.java.java_3.serial;

import java.io.IOException;

public class SerialMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Fax fax = new Fax("Generic Brand", "123", "1998");
        Message message1 = new Message(1, "This is a test message!");

        fax.transmit(message1);
        fax.receive("serial.ser");

        Message message2 = new Message(2, "This is another test!");
        fax.transmit(message2);
        fax.receive("serial.ser");
    }
}
