package oop;

public class BankAccount implements IRate{
	//Whats a bank account going to have?
		// name, ssn, account number, balance, withdrawals, deposits
	
	//Define variables
	
	//Static Variable
	String accountNumber;
	private static final String routingNumber = "93302895"; //static is saying this variable belongs to the class, and not the particular object.
													//final- makes the variable a constant(often static final > will go together)
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION- gets called as soon as object is created(never called explicitly- gets called automatically
		// 3. The same name as the class itself.
		// 4. Constructors have NO return type at all (no return, no String, no void, etc)
	
	BankAccount() {
		System.out.println("new account created");
	}
	// Overloading: call same method name with different arguments- java knows which method to call based on the arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, accountType, msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITITAL DEPOSIT OF: $" + initDeposit);
		String msg = null;
		if(initDeposit< 1000) {
			msg = "ERROR- Minimum deposit must be at least $1,000.";
		}else {
			msg = "Thank you for your deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		balance += initDeposit;
		
	}
	
	
	//Getters and Setters
	
	//Allow the use to define the name ( call a function that will define the name)
	public void setName(String name) {
		this.name = name; // this refers to *name* in the class, *=name* refers to the name within the parameters of this method
	}
	public String getName() {
		return name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
	
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	//Define Methods (term for functions in OOP)
	// Public - available anywhere in project
	// Default - available anywhere in package
	// Private - available only within the class;
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT of " + amount);
	}
	
	void withdrawal(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAWAL of " + amount);
		
	}
	
	private void showActivity(String activity) {
		System.out.println("Your recent Transaction: " + activity);
		System.out.println("You new Balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is:" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: "  + name + ", ACCOUNT Number: " +  accountNumber + ". BALANCE $" + balance + "]";
	}
}
