package com.example.airlinetest.domain.model;

import com.example.airlinetest.infrastructure.repository.database.entity.FlightE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private Long id;
    private String destiny;

    public static FlightE toEntity(Flight flight) {
        return FlightE.builder()
                .destiny(flight.getDestiny())
                .build();
    }

    public static Flight toDomain(FlightE flight) {
        return Flight.builder()
                .id(flight.getId())
                .destiny(flight.getDestiny())
                .build();
    }
}
