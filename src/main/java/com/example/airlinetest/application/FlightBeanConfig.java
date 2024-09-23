package com.example.airlinetest.application;

import com.example.airlinetest.domain.FlightUseCase;
import com.example.airlinetest.domain.gateways.FlightRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlightBeanConfig {

    @Bean
    public FlightUseCase flightUseCase(FlightRepository repository) {
        return new FlightUseCase(repository);
    }
}
