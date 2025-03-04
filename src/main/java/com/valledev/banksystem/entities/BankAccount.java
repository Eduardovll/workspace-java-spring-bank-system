package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public abstract class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private AccountType accountType;

    public BankAccount(String accountNumber, String accountHolderName, double balance, AccountType accountType) {
        this.accountNumber = formatAccountNumber(accountNumber);
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private String formatAccountNumber(String accountNumber) {
        try {
            return String.format("%010d", Integer.parseInt(accountNumber));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Número da conta inválido!");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String toString() {
        return "Conta: " + accountNumber + " - " + accountHolderName +
                "\nTipo: " + accountType +
                "\nSaldo final: R$ " + String.format("%.2f", balance);
    }
}
