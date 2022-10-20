package com.java.springBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addresses {

    @Bean
    public String address() {
        return "Green Street, 102";
    }
}
