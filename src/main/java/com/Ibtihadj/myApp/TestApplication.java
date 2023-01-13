package com.Ibtihadj.Test;

import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	KeycloakRestTemplate restTemplate(KeycloakClientRequestFactory keycloakClientRequestFactory){
		return new KeycloakRestTemplate((keycloakClientRequestFactory));
	}

}


