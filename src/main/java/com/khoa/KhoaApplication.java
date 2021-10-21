package com.khoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class KhoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhoaApplication.class, args);
	}

}
