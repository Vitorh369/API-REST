package br.com.apiproduto.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API PRODUTO")
						.description("API PRODUTO NA CLOUND")
						.version("1.0.0"));
	}
}
