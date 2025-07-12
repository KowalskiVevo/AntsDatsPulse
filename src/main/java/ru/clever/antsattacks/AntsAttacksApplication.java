package ru.clever.antsattacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AntsAttacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntsAttacksApplication.class, args);
	}

}
