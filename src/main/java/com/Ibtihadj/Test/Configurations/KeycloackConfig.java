package com.Ibtihadj.Test.Configurations;


import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.adapters.spi.HttpFacade;
import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloackConfig {

    @Bean
    public KeycloakConfigResolver keycloakConfigResolver() {


        return new KeycloakConfigResolver() {
            @Override
            public KeycloakDeployment resolve(HttpFacade.Request request) {
                return null;
            }
        };
    }

    @Bean
    KeycloakRestTemplate keycloakRestTemplate(KeycloakClientRequestFactory keycloakClientRequestFactory){
        return new KeycloakRestTemplate(keycloakClientRequestFactory);
    }

}
