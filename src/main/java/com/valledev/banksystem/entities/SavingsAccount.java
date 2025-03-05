package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public class SavingsAccount extends BankAccount {

    private static final double RENDIMENTO = 0.005;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance, AccountType.SAVINGS);
    }

    @Override
    public void applyTransaction(double amount, boolean isDeposit) {
        if (isDeposit) {
            balance += amount;
        } else {
            if (balance - amount < 0) {
                throw  new IllegalArgumentException("Saldo insuficiente para saque!");
            }
            balance -= amount;
        }
        balance += balance * RENDIMENTO;
    }
}
