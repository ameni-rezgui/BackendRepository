package com.sesame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sesame.MetierInterface.ClientMetierInterface;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ClientMetierInterface.class)
public class RendezVousPpeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendezVousPpeApplication.class, args);
	}

}
