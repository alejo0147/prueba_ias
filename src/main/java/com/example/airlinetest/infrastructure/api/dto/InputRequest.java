package com.example.airlinetest.infrastructure.api.dto;

import com.example.airlinetest.domain.model.Booking;
import com.example.airlinetest.domain.model.Flight;
import com.example.airlinetest.domain.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class InputRequest {
    private String name;
    private String lastName;
    private String flightCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date flightDate;
    private String destiny;
    private String comments;

    public static Booking toDomain(InputRequest request) {
        return Booking.builder()
                .user(User.builder()
                        .name(request.getName())
                        .lastName(request.getLastName())
                        .build())
                .flight(Flight.builder()
                        .destiny(request.getDestiny())
                        .build())
                .flyDate(request.getFlightDate())
                .comments(request.getComments())
                .build();
    }
}
