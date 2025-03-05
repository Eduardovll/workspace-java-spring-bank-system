package com.valledev.banksystem.services;

import com.valledev.banksystem.entities.BankAccount;
import com.valledev.banksystem.entities.CurrentAccount;
import com.valledev.banksystem.entities.SavingsAccount;
import com.valledev.banksystem.enums.AccountType;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public BankAccount createAccount(String accountHolderName, String accountNumber, double balance, AccountType accountType) {
        if (accountType == AccountType.CURRENT) {
            return new CurrentAccount(accountHolderName, accountNumber, balance);
        } else if (accountType == AccountType.SAVINGS) {
            return new SavingsAccount(accountHolderName, accountNumber, balance);
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido!");
        }
    }
}
