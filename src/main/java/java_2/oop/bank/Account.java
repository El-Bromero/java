package java_2.oop.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {

	/*
		Properties:
			Bank (bank where the account is stored)
			accountNumber
			accountHolder (Customer)
			balance
			type (savings, checking, etc.)
			transactions (list of transactions)

		Methods :
			deposit(money); //add to the balance and the transaction history
			withdraw(money); //withdraw from the balance and add to the transaction history;


	 */

    private Bank bank;
    private int accountNumber;
    private Customer accountHolder;
    private double balance;
    private String type;
    private List<String> transactions;

    public Account(Bank bank, int accountNumber, Customer accountHolder, double balance, String type) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type = type;
        transactions = new ArrayList<>();
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Customer accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public double deposit(double money) {
        balance+= money;
        transactions.add("$" + money + " deposited into balance. Balance total: " + balance);
        return balance;
    } //add to the balance and the transaction history

    public double withdraw(double money) {
        if (balance - money < 0.0)
        {
            System.out.println("Cannot withdraw $" + money + " from balance. Balance cannot go below $0.00!");
        }
        else
        {
            balance-= money;
            transactions.add("$" + money + " withdrawn from balance. Balance total: " + balance);
        }
        return balance;

    } //withdraw from the balance and add to the transaction history;

    @Override
    public String toString() {
        return "Account{" +
                "bank=" + bank +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountHolder=" + accountHolder +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
