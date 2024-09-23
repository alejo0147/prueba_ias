package com.example.airlinetest.application;

import com.example.airlinetest.domain.UserUseCase;
import com.example.airlinetest.domain.gateways.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBeanConfig {

    @Bean
    public UserUseCase userUseCase(UserRepository repository) {
        return new UserUseCase(repository);
    }
}
