package main.java.java_2.oop.phone;

public class PhoneApp {

	public static void main(String[] args) {
		System.out.println("Let's make a Phone App");
/*
		-Use this to instantiate CellPhones and run the functions on the CellPhone.  You can run the following functions here in the main method, or add methods on this PhoneApp class and invoke them here.  The latter is probably preferred :)
		-iPhone-12, Samsung Galaxy S21, and any other phone model of your choosing.
		-Add 3 unique contacts to each cell phone
		-Make a phone call from each Cell Phone to a contact in the contact list of that Cell Phone
		-Update the contact list of a specific contact on one cell phone
		-Remove a Contact of a specific contact on another cell phone
		-Add a new contact to one of the cell phones.
		-Search for a contact by name in one of the cell phones.
		-Make the CellPhone class implement the Phoneable interface.  Implement the methods how you see fit in the CellPhone Class
*/
		/* iPhone-12, Samsung Galaxy S21, and any other phone model of your choosing. */
		CellPhone iPhone12 = new CellPhone(1000.00, "Sprint", "Apple", true);
		CellPhone galaxyS21 = new CellPhone(1000.00, "T-Mobile", "Samsung", true);
		CellPhone nokia3210 = new CellPhone(99.99, "AT&T", "Nokia", false);

		/* Add 3 unique contacts to each cell phone */
		Contact bob = new Contact("Bob Builder", "555-555-5555", "123 Street");
		iPhone12.addContact(bob);
		Contact robert = new Contact("Robert Roberson", "565-565-6556", "321 Main St");
		iPhone12.addContact(robert);
		Contact steven = new Contact("Steven Jobs", "123-555-6666", "213 Second St");
		iPhone12.addContact(steven);
		System.out.println();

		/* Add 3 unique contacts to each cell phone */
		Contact sissie = new Contact("Sissie Lobe", "994-623-7496", "45458 Harbor Terrace");
		galaxyS21.addContact(sissie);
		Contact jacobo = new Contact("Jacobo Spurned", "979-923-1330", "3 Welch Circle");
		galaxyS21.addContact(jacobo);
		Contact alexine = new Contact("Alexine Evens", "177-963-8625", "24868 Kiryl Lane");
		galaxyS21.addContact(alexine);
		System.out.println();

		/* Add 3 unique contacts to each cell phone */
		Contact cherrita = new Contact("Cherrita Cherry", "218-993-3344", "5 Maple Parkway");
		nokia3210.addContact(cherrita);
		Contact gerome = new Contact("Gerome Hodgson", "630-705-2691", "881 Main Terrace");
		nokia3210.addContact(gerome);
		Contact neille = new Contact("Neille Syed", "302-870-9062", "2 Dale Terrace");
		nokia3210.addContact(neille);
		System.out.println();

		/* Make a phone call from each Cell Phone to a contact in the contact list of that Cell Phone */
		iPhone12.call(robert);
		galaxyS21.call(jacobo);
		nokia3210.call(neille);
		iPhone12.call(neille); // Example of contact not in contact list being called
		System.out.println();

		/* Update the contact list of a specific contact on one cell phone */
		bob.setAddress("987 Something Else St");
		bob.setPhoneNumber("123-456-7890");
		iPhone12.updateContact(bob);
		System.out.println();

		/* Remove a Contact of a specific contact on another cell phone */
		galaxyS21.removeContact(alexine);
		System.out.println();

		/* Add a new contact to one of the cell phones. */
		Contact johnny = new Contact("Johnny Silverhands", "123-456-2077", "321 Los Valentinos");
		nokia3210.addContact(johnny);
		System.out.println();

		/* Search for a contact by name in one of the cell phones. */
		iPhone12.searchContact("Steven Jobs");
		iPhone12.searchContact("Neille Syed"); // Example of name not in contact list
		System.out.println();


	}
}
