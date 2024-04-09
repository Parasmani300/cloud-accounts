package com.redchat.Account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountApplication implements CommandLineRunner {

	@Value("${spring.datasource.password}")
	String password;

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(password);
	}
}
