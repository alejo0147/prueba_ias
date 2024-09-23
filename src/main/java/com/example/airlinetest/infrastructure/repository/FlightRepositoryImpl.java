package com.example.airlinetest.infrastructure.repository;

import com.example.airlinetest.domain.gateways.FlightRepository;
import com.example.airlinetest.domain.model.Flight;
import com.example.airlinetest.infrastructure.repository.database.DbFlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FlightRepositoryImpl implements FlightRepository {
    private final DbFlightRepository repository;

    @Override
    @Transactional
    public Flight save(Flight flight) {
        return Flight.toDomain(repository.save(Flight.toEntity(flight)));
    }
}
