package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account >> Think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		
		//acc1.name = "Roger Hue"; // Old way**
		// With Encapsulation: public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("3992004948230");
		System.out.println("The SSN is: " + acc1.getSsn());
		
		
		acc1.accountNumber = "399520837";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		
		
		acc1.deposit(1500);
	
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "3995802939";
		
		BankAccount acc3 = new BankAccount("Savings Account", 1000);
		acc3.accountNumber = "3995029389";

		/*
		acc3.checkBalance();

		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		//cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
