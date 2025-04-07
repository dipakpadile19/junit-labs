package com.oracle.training.dayone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount("12345", 1000.0);
        assertEquals(1000.0, account.getBalance());  // This test will fail because BankAccount does not exist
    }
@Test
void testDeposit() {
    BankAccount account = new BankAccount("12345", 1000.0);
    account.deposit(500.0);  // Deposit method does not exist yet
    assertEquals(1500.0, account.getBalance());  // This test will fail
}
@Test
void testWithdraw() {
    BankAccount account = new BankAccount("12345", 1000.0);
    account.withdraw(200.0);  // Method does not exist yet
    assertEquals(800.0, account.getBalance());  // This will fail
}

}