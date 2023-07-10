package com.boottech;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAwsParameterStoreApplication {

	@Value("${some.value}")
	String url;

	@PostConstruct
	public void init() {
		System.out.println(url);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsParameterStoreApplication.class, args);
	}

}
