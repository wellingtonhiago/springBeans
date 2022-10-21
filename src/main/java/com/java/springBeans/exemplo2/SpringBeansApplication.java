package com.java.springBeans.exemplo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBeansApplication {

    public static void main(String[] args) {

        SpringApplication.run(com.java.springBeans.exemplo1.SpringBeansApplication.class, args);
    }

    @Bean
    public List<String> employees() {
        return List.of(
                "Lillia Barber",
                "Todd Mcloughlin",
                "Jasmine Wu"
        );
    }

    @Bean
    public Company company(@Autowired List<String> employees) {
        return new Company("WorkProject", employees);
    }
}
