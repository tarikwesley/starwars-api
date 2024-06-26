package com.starwars.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.starwars.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("STAR WARS REST API", "Created to register Star Wars planets by passing name," +
                "climate and terrain. And to consume an external API with being the StarWars public API to obtain " +
                "the number of times the registered planet appeared in the franchise's films. Java 8 was used for " +
                "development, Spring Boot, Mongodb and Docker.", "v1", "Api - Free",
                new Contact("Tarik Wesley", "https://github.com/tarikwesley", "starwars@email.com"),
                null, null, new ArrayList<>());
    }
}
