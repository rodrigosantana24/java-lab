package entities;

public class Account {
	private int number;
	private String holderName;
	private double balance;
	
	public Account(int number, String holderName, double initialDeposit) {
		this.number = number;
		this.holderName = holderName;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holderName) {
		this.number = number;
		this.holderName = holderName;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolder(String newHolderName) {
		this.holderName = newHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void sake(double value) {
		this.balance = this.balance - value - 5; ; 
	}	
	
	public String toString() {
		return "Account: " 
			   + number 
			   + ", Holder: " 
			   + holderName 
			   + ", Balance: $" 
			   + String.format("%.2f", balance);
	}
}

