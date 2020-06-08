package com.test.rest.webservices.restwebservicesdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by dharma on 6/5/20.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    private static final Contact DEFAULT_CONTACT =  new Contact("test" ,"http://www.ll.com" , "aa@gmail.com");

    public static final ApiInfo DEFAULT_API_INFO =
        new ApiInfo("My API Title", "Api Documentation is awsome", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO);

    }
}
