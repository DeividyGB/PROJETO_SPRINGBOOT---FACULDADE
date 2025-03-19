package com.programacao.web.fatec.api_fatec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI cusOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("API do PROJETO 2025")
                        .version("1.0")
                        .description("Documentação da API do PROJETO 2025"));
    }
}
