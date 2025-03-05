package com.valledev.banksystem.entities;

import com.valledev.banksystem.enums.AccountType;

public class CurrentAccount extends BankAccount{

    private static final double TAXA_MANUTENCAO = 15.00;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance, AccountType.CURRENT);
    }

    @Override
    public void applyTransaction(double amount, boolean isDeposit) {
        if (isDeposit) {
            balance += amount;
        } else {
            if (balance - amount - TAXA_MANUTENCAO < 0) {
                throw new IllegalArgumentException("Saldo insuficiente para saque!");
            }
            balance -= (amount + TAXA_MANUTENCAO);
        }
    }
}
