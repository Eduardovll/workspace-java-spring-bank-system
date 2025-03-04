package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public class SavingsAccount extends BankAccount {

    private static final double RENDIMENTO = 0.005;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, AccountType accountType) {
        super(accountNumber, accountHolderName, balance, accountType);
    }
}
