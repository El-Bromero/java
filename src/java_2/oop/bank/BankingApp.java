package java_2.oop.bank;

public class BankingApp {

	public static void main(String[] args) {
			/*
				-Create a Bank
				-Create 5 Customers
				-Open a new account for each customer.
				-have 3 customers withdraw and deposit, making sure the account balances update.
				-Close 2 of the customer accounts.
				-view the opened accounts at the Bank.
				-find an account by any of the customer credentials
				-find an account by account number.
		 	*/
		/* Create a Bank */
		Bank bank = new Bank();

		/* Create 5 Customers */
		Customer bob = new Customer("Bob", "Builder", "12-123-1234", "01/01/1990", 2234.50);
		Customer bronson = new Customer("Bronson", "Son", "21-321-4234", "02/11/1940", 503.99);
		Customer alice = new Customer("Alice", "Wonderland", "83-343-5345", "05/30/1921", 12033.50);
		Customer joe = new Customer("Joe", "Mama", "23-123-3474", "01/01/1900", 300.50);
		Customer mario = new Customer("Mario", "Luigi", "72-063-9035", "06/09/2001", 3.50);

		/* Open a new account for each customer. */
		Account bobAccount = bank.openAccount(bob, "Checking");
		Account bronsonAccount = bank.openAccount(bronson, "Savings");
		Account aliceAccount = bank.openAccount(alice, "Checking");
		Account joeAccount = bank.openAccount(joe, "Checking");
		Account marioAccount = bank.openAccount(mario, "Savings");

		/* have 3 customers withdraw and deposit, making sure the account balances update. */
		bronsonAccount.deposit(bronson.getWallet());
		bronsonAccount.withdraw(100.99);
		System.out.println(bronsonAccount.getTransactions());
		bobAccount.deposit(1000.25);
		bobAccount.withdraw(500.21);
		System.out.println(bobAccount.getTransactions());
		aliceAccount.withdraw(111.11); // Example of withdrawing from empty balance
		aliceAccount.deposit(5555.11);
		aliceAccount.withdraw(111.11);
		System.out.println(aliceAccount.getTransactions());
		System.out.println();

		/* Close 2 of the customer accounts. */
		bank.closeAccount(joeAccount);
		bank.closeAccount(marioAccount);

		/* view the opened accounts at the Bank. */
		System.out.println(bank.getAccounts());
		System.out.println();

		/* find an account by any of the customer credentials */
		System.out.println(bank.getAccountByCustomer(alice));
		System.out.println(bank.getAccountByCustomer(mario)); // Example of customer with closed account. Returns null
		System.out.println();

		/* find an account by account number. */
		// The 5 accounts that we made have the account numbers of 1,2,3,4,5
		System.out.println(bank.getAccountByNumber(1));
		System.out.println(bank.getAccountByNumber(6)); // Example of acc num that doesn't exist in accounts. Returns null

	}
}
