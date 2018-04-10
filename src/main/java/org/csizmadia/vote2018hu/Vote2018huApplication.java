package org.csizmadia.vote2018hu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

/**
 * Hungarian parliamentary elections 2018 Results parser main class.
 * 
 * @author Tamas Csizmadia
 */
@SpringBootApplication
@Order(2)
public class Vote2018huApplication {

	public static void main(String[] args) {
		SpringApplication.run(Vote2018huApplication.class, args);
	}
}
