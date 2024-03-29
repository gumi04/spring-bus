package com.example.productmicroservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    /**
     * Api info.
     *
     * @return the api info
     */
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("Prueba API")
                        .description("Test  microservices")
                        .version("V 1.0")
                        .license(new License().name("Apache License Version 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"))
                        .contact(new Contact().name("test.com").url("https://www.test.com/").email("atencion@test.com")));
    }
}
