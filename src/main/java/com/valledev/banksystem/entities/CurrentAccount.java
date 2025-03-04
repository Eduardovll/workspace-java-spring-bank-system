package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public class CurrentAccount extends BankAccount{

    private static final double TAXA_MANUTENCAO = 15.00;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, AccountType accountType) {
        super(accountNumber, accountHolderName, balance, accountType);
    }
}
