package com.chrisvz.rands.chrisvzrands;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
@SpringBootApplication
public class ChrisvzrandsApplication {
	
	@Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

	public static void main(String[] args) {
		SpringApplication.run(ChrisvzrandsApplication.class, args);
	}
}
