package com.example.pkce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PkceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PkceApplication.class, args);
	}

}

@Controller
class PkceController {

	@GetMapping
	public String index(@RegisteredOAuth2AuthorizedClient("login-client") OAuth2AuthorizedClient client) {
		System.out.println(client.getAccessToken().getTokenValue());
		return "index";
	}
}
