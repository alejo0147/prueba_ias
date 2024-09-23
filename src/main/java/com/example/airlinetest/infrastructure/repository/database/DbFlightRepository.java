package com.example.airlinetest.infrastructure.repository.database;

import com.example.airlinetest.infrastructure.repository.database.entity.FlightE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbFlightRepository extends JpaRepository<FlightE, Long> {
}
