package day03.solved;

class Account {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public Account() {

	}
	//#1 way to set values to attributes
	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	//#2 way to set values to attributes
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

public class ConstructorLearning {
	public static void main(String[] args) {

		// create Account using Setter methods and Default constructor
		Account acct1 = new Account();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-"
				+ acct1.getBalance());
		
		// Create Account with Overloaded constructor accepting parameters
		Account acct2 = new Account("A102", "Arun", 1000);
		System.out.println(acct2.getAccNo() + "-" + acct2.getName() + "-"
				+ acct2.getBalance());

	}
}