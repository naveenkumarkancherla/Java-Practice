package com.naveenPracticeJava;
import java.util.Scanner;
public class Bank {
    
	static int currentBalance = 1000;
	// access_modifier  static/non-static  return_type  method_name(){ }
	// void is a reserved word in java which returns nothing
	public static void greetCustomer(String name) {
		// method body!
		System.out.println("Hello,"+name+" Welcome to the banking Application!");
	}
    // in non static you no need to mention as non-static just simply leave it
	public void deposit(int amount) {
		currentBalance += amount;
		System.out.println("Amount deposited successfully! of ₹"+amount);
	}
	
	public static void withdrawls(int amount) {
		currentBalance -= amount;
		System.out.println("Amount withdrawl successful! of ₹"+amount);
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter amount for deposit:");
		int amount = sc.nextInt();
		Bank bank = new Bank();
		greetCustomer(name);
		System.out.println("Current balance in your account ₹"+bank.getCurrentBalance());
		bank.deposit(amount);
		System.out.println("Current balance in your account ₹"+bank.getCurrentBalance());
		System.out.println("Enter amount for withdrawl:");
		amount = sc.nextInt();
		withdrawls(amount);
		System.out.println("Current balance in your account ₹"+bank.getCurrentBalance());
	}
}
