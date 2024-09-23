package com.example.airlinetest.infrastructure.repository.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flights")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FlightE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destiny;
}
