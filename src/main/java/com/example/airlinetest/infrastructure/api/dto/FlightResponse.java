package com.example.airlinetest.infrastructure.api.dto;

import lombok.Builder;

@Builder
public record FlightResponse(String destiny) {
}
