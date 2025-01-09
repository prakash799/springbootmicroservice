package com.easybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Account Microservice Rest Application",
		description = "Easy Bank Account Microservice Rest Api Documentation",
		version = "v1",
		contact = @Contact(
				name = "Ved Prakash",
				email = "pandeyprakash799@gmail.com",
				url = "myownwebsite.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "myownwebsite.com"
		)
),
externalDocs = @ExternalDocumentation(
		description = "Easy Back Accounts Microservices Rest API Documentation",
		url = "myownwebsite.com"
)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
