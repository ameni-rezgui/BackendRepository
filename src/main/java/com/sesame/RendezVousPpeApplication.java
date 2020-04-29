package com.sesame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sesame.Repository.ClientRepository;





@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ClientRepository.class)

public class RendezVousPpeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendezVousPpeApplication.class, args);
	}

}
