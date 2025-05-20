package com.trackzone.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@com.trackzone.config.Configuration
public class SwaggerConfig {

    @com.trackzone.config.Bean
    public com.trackzone.config.OpenAPI customOpenAPI() {
        return new com.trackzone.config.OpenAPI()
            .info(new Info()
                .title("Controle de Pátio API")
                .version("1.0")
                .description("API para controle de entrada e saída de motos em pátios."));
    }
}