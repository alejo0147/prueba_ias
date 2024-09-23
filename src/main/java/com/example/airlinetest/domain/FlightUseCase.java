package com.example.airlinetest.domain;

import com.example.airlinetest.domain.gateways.FlightRepository;
import com.example.airlinetest.domain.model.Flight;

public class FlightUseCase {
    private final FlightRepository repository;

    public FlightUseCase(FlightRepository repository) {
        this.repository = repository;
    }

    public Flight create(Flight flight) {
        return repository.save(flight);
    }
}
