package com.valledev.banksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class BankSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(BankSystemApplication.class, args);}

	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}
}
