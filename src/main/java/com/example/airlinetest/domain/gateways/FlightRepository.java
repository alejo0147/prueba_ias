package com.example.airlinetest.domain.gateways;

import com.example.airlinetest.domain.model.Flight;

public interface FlightRepository {
    Flight save(Flight flight);
}
