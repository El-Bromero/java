package main.java.java_2.oop.phone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CellPhone implements Phoneable {

/*
	* Properties :
	* 	contact list
	* 	cost
	*   carrier (Verizon, AT&T, T-Mobile, etc.)
	*   brand (Apple, Samsung, Motorola, etc.)
	* 	power (is the phone turned on or off? yes or no)

	* Functionality :
	 	- call(Contact); display a message indicating the Contact's phone number is being called. Note that the cell phone can only call contacts that are in the contact list.
		- addContact(Contact) add a new Contact to the contact list.
		- updateContact(Contact) //setter
		****When adding or updating be sure to check if the contact already exists****
		- removeContact(Contact) remove a contact from the contact list of the cell phone
		- searchContacts(Contact) return a contact from the contact list if one exists.
		* getters and setters for carrier, brand, and cost

****Be sure not to expose the inner workings of the CellPhone (use concepts of encapsulation)**
*/

    private Set<Contact> contacts;
    private double cost;
    private String carrier;
    private String brand;
    private boolean power;

    public CellPhone(double cost, String carrier, String brand, boolean power) {
        this.contacts = new HashSet<>();
        this.cost = cost;
        this.carrier = carrier;
        this.brand = brand;
        this.power = power;
    }

    @Override
    public void call(Contact contact) {
        if(contacts.contains(contact)) {
            System.out.println(contact.getName() + "/" + contact.getPhoneNumber() + " is being called!");
        }
        else {
            System.out.println("Contact could not be found. No call was made. Make sure the contact has been added to the cell phone!");
        }
    }

    @Override
    public void ring() {
        System.out.println("Your phone is ringing!");
    }

    @Override
    public void hangUp() {
        System.out.println("You hung up your phone!");
    }

    @Override
    public void pickUp() {
        System.out.println("You picked up your phone!");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off...");
        power = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on...");
        power = true;
    }

    public void addContact(Contact contact) {
        if(contacts.contains(contact))
        {
            System.out.println("Contact " + contact.getName() + " already exists in contact list!");
        }
        else
        {
            System.out.println(contact.getName() + " was added to your contact list!");
            contacts.add(contact);
        }
    }

    public void updateContact(Contact contact) {
        if(contacts.contains(contact))
        {
            contacts.remove(contact);
            contacts.add(contact);
            System.out.println(contact.getName() + " was updated in the contact list!");
        }
        else
        {
            System.out.println("Contact not present in contact list. Cannot update contact!");
        }
    }

    public void removeContact(Contact contact) {
        if(contacts.contains(contact))
        {
            System.out.println(contact.getName() + " will be removed from the contact list!");
            contacts.remove(contact);
        }
        else
        {
            System.out.println(contact.getName() + " does not exist in your contact list! No contact removed");

        }
    }

    public Contact searchContact(Contact contact) {
        if(contacts.contains(contact))
        {
            System.out.println("Contact was found in your contact list!");
            return contact;
        }
        else
        {
            System.out.println("Contact does not exist in your contact list!");
            return null;
        }

    }

    // Second searchContact method which takes in String name to search based on name of contact
    public Contact searchContact(String name) {
        for(Contact info : contacts)
        {
            if(info.getName() == name)
            {
                System.out.println(name + " was found. Displaying contact info.");
                return info;
            }
        }
        System.out.println(name + " was not found in the contact list!");
        return null;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "contacts=" + contacts +
                ", cost=" + cost +
                ", carrier='" + carrier + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }
}


