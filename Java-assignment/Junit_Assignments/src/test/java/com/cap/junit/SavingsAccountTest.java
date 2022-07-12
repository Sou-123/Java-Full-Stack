package com.cap.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;

class SavingsAccountTest {
	SavingsAccount account;
	 double delta=0.005;
	 
	 @BeforeEach
	 void setUp() throws Exception {
	 account= new SavingsAccount();

	 account.setBalance(5000);
	 
	 }

	 @AfterEach
	 void tearDown() throws Exception {
	 account=null;
	 }

	 @Test
	 void depositTest() {
	 account.deposit(8000);
	 assertEquals(account.getBalance(),5500,delta,"Deposit Test");
	 }
	 
	 @Test
	 void withdrawTest() {
	 account.withdraw(8000);
	 assertEquals(account.getBalance(),4500.0,delta,"Withdraw Test");
	 }
	 
	 
	}