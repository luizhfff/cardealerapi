package com.lhfff.cardealerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.lhfff.cardealerapi.controller.CarController;

@SpringBootApplication
public class CardealerapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardealerapiApplication.class, args);
		
	}

}
