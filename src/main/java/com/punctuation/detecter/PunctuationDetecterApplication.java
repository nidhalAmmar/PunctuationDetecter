package com.punctuation.detecter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.punctuation.detecter.Controller", "com.punctuation.detecter.Service"})
public class PunctuationDetecterApplication {

	public static void main(String[] args) {

		SpringApplication.run(PunctuationDetecterApplication.class, args);

	}

}
