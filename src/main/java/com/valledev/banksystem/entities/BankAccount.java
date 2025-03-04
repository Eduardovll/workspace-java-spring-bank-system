package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double initialBalance;
    private AccountType accountType;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, AccountType accountType) {
        setAccountNumber(accountNumber);
        this.accountHolderName = accountHolderName;
        this.initialBalance = initialBalance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = String.format("%010d", Integer.parseInt(accountNumber));
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
