package com.valledev.banksystem.services;

import com.valledev.banksystem.entities.BankAccount;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public void processTransaction(BankAccount account, double amount, boolean isDeposit) {
        account.applyTransaction(amount, isDeposit);
    }
}
