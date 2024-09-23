package com.example.airlinetest.infrastructure.api.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public record BookingResponse(String comments, Date flightDate, UserResponse user, FlightResponse flight) {
}
