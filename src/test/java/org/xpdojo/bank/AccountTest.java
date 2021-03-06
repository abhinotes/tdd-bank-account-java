package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    // TODO : I can Deposit money to accounts
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        double balanceAfterDeposit = account.getCurrentBalance();
        assertThat(balanceAfterDeposit).isEqualTo(100);
    }

    @Test
    public void depositAmountMultipleTimesToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(20);
        double balanceAfterDeposit = account.getCurrentBalance();
        assertThat(balanceAfterDeposit).isEqualTo(120);
    }

    @Test
    public void depositFloatAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(20.50);
        double balanceAfterDeposit = account.getCurrentBalance();
        assertThat(balanceAfterDeposit).isEqualTo(120.50);
    }


    // TODO : I can Withdraw money from accounts
    // TODO : I can Transfer amounts between accounts (if I have the funds)
    // TODO : I can print out an Account balance slip (date, time, balance)
    // TODO : I can print a statement of account activity (statement)
    // TODO : I can apply Statement filters (include just deposits, withdrawal, date)

}
