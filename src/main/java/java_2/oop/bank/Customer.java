package main.java.java_2.oop.bank;

public class Customer {
		/*
			Properties :
				firstName;
				lastName;
				ssn;
				dob;
				wallet; $ in the wallet
		*/

    private String firstName;
    private String lastName;
    private String ssn;
    private String dob;
    private double wallet;

    public Customer(String firstName, String lastName, String ssn, String dob, double wallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.wallet = wallet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob='" + dob + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}

