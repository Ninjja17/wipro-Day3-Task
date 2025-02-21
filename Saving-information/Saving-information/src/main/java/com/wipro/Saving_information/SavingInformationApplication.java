package com.wipro.Saving_information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SavingInformationApplication {

	public static void main(String[] args) {

		SpringApplication.run(SavingInformationApplication.class, args);
	}
   @Bean
	public WebClient webClient(){
		return WebClient.builder().build();

   }
}
