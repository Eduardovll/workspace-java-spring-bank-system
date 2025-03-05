package com.valledev.banksystem;

import com.valledev.banksystem.entities.BankAccount;
import com.valledev.banksystem.enums.AccountType;
import com.valledev.banksystem.services.AccountService;
import com.valledev.banksystem.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BankSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(BankSystemApplication.class, args);}

	@Autowired
	private TransactionService transactionService;

	@Autowired
	private AccountService accountService;

	public void run(String... args) throws Exception {

		System.out.println("🏦 Bank System Started!");

		List<AccountType> accountTypes = new ArrayList<>();
		accountTypes.add(AccountType.SAVINGS);
		accountTypes.add(AccountType.CURRENT);

		List<Boolean> transactionTypes = new ArrayList<>();
		transactionTypes.add(true);
		transactionTypes.add(false);

		for (int i = 0; i < accountTypes.size(); i++) {
			AccountType type = accountTypes.get(i);
			boolean isDeposit = transactionTypes.get(i);

			BankAccount account = accountService.createAccount("777", "Eduardo", 1000.00, type);
			System.out.println(account);


			System.out.println("\n🏦 Processing transaction for account " + account.getAccountNumber());
			transactionService.processTransaction(account, 200, isDeposit);
			System.out.println(account);
			System.out.println("\n-------------------------------");
		}

		System.out.println("\n🏦 Bank System Updated!");
	}
}
