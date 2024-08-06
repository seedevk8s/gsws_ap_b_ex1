package com.config;

import com.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("참앵무상과");
        return p;
    }

    @Bean
    String hello() {
        return "Hello, Spring!";
    }

    @Bean
    Integer ten() {
        return 10;
    }

}
