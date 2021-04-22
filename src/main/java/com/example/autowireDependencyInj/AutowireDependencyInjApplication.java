package com.example.autowireDependencyInj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireDependencyInjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowireDependencyInjApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
