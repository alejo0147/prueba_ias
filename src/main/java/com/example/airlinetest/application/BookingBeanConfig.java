package com.example.airlinetest.application;

import com.example.airlinetest.domain.BookingUseCase;
import com.example.airlinetest.domain.FlightUseCase;
import com.example.airlinetest.domain.UserUseCase;
import com.example.airlinetest.domain.gateways.BookingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookingBeanConfig {

    @Bean
    public BookingUseCase bookingUseCase(BookingRepository repository, UserUseCase userUseCase, FlightUseCase flightUseCase) {
        return new BookingUseCase(repository, userUseCase, flightUseCase);
    }
}
