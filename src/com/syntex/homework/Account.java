package com.syntex.homework;

public class Account {

	private String userName="Sultankul";
	private String password="HelloPassword";
	public int accountNumber=123456;
	protected double balance=10000000;
	
	public void printUserName() {
		System.out.println(userName);
	}
	protected void printPassword() {
		System.out.println(password);  
	}
	void printAccount() {
		System.out.println(accountNumber);
	}
	private void printBalance() {
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		Account am=new Account();
		am.printUserName();
		am.printPassword();
		am.printAccount();
		am.printBalance();
		
	}
}
