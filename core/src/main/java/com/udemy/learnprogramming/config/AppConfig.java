package com.udemy.learnprogramming.config;

import com.udemy.learnprogramming.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "com.udemy.learnprogramming")
public class AppConfig {

    // == bean methods ==
    @Bean
    public Game game() {
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGeneratorImpl();
    }
}
