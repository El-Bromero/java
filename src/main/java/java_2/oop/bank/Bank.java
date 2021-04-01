package java_2.oop.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	/*
		Properties:
			accounts;

		Methods :
			openAccount(); //create a new account, add it to the accounts list, and return it.
			closeAccount(Account); close the account by removing it from the account list. and removing it's association with this Bank
	 		getAccountByCustomer(Customer);
	 		getAccountByNumber(acctNum);
	 */
    private List<Account> accounts;
    private int accountNumber;

    public Bank() {
        accounts = new ArrayList<>();
        accountNumber = 0;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account openAccount(Customer customer, String type) {
        accountNumber++;
        Account newAccount = new Account(this, accountNumber, customer, 0.0d, type);
        accounts.add(newAccount);
        return newAccount;
    }

    public void closeAccount(Account account) {
        account.setBank(null); // Removing Bank reference by making it null
        accounts.remove(account);
        System.out.println("Account number: " + account.getAccountNumber() + " has been closed!");
    }

    public Account getAccountByCustomer(Customer customer) {
        for(Account account : accounts)
        {
            if(account.getAccountHolder() == customer)
            {
                return account;
            }

        }
        System.out.println("Account could not be found with customer information!");
        return null;
    }

    public Account getAccountByNumber(int acctNum) {
        for(Account account : accounts)
        {
            if(account.getAccountNumber() == acctNum)
            {
                return account;
            }
        }
        System.out.println("Account could not be found using account number!");
        return null;
    }
}