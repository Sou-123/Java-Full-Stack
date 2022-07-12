package com.cap.junit;

public class SavingsAccount extends Account implements IAccount {
	 

	 public SavingsAccount( double initBalance) {
	 super(initBalance);
	 }
	 
	 public SavingsAccount() {

	 }

	 @Override
	 public void withdraw(double amount) {
	 double newBalance = getBalance() - amount;
	 if(newBalance<0){
	 System.out.println("Withdraw not permitted");
	 return;
	 }else{
	 System.out.println("Amount "+amount+"withdrawn successfully");
	 }
	 setBalance(newBalance);
	 }

	 @Override
	 public void deposit(double amount) {
	 System.out.println("Amount "+amount+" deposited successfully");
	 double newBalance = getBalance() + amount;
	 setBalance(newBalance);
	 }

	 

	 @Override
	 public double getBalance() {
	 return super.getBalance();
	 }


	 

	}
