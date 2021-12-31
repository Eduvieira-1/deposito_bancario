package entities;

public class Account {

	private int num;
	private String name;
	private double balance;

	public Account(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public Account(int num, String name, double initialDeposit) {
		this.num = num;
		this.name = name;
		addDeposit(initialDeposit);
	}
	
	public int getNum() {
		return num;
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

	
	public void addDeposit(double amount) {
		this.balance += amount;
	}
	
	public void removeDeposit(double amount) {
		this.balance -= amount + 5.0;
	}

	public String toString() {
		return num 
				+ ", " 
				+ "Holder: " 
				+ name 
				+ ", "
				+ "Balance: " 
				+ String.format("%.2f", balance);
	}

}
