package com.config;

import com.kosta.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("참앵무상과");
        return p;
    }
/*

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("왕관앵무");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("사랑앵무");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("러브버드");
        return p;
    }
*/

}
