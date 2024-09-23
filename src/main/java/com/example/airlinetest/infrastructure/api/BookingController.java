package com.example.airlinetest.infrastructure.api;

import com.example.airlinetest.domain.BookingUseCase;
import com.example.airlinetest.domain.model.Booking;
import com.example.airlinetest.infrastructure.api.dto.BookingResponse;
import com.example.airlinetest.infrastructure.api.dto.FlightResponse;
import com.example.airlinetest.infrastructure.api.dto.InputRequest;
import com.example.airlinetest.infrastructure.api.dto.OutputResponse;
import com.example.airlinetest.infrastructure.api.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookings")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class BookingController {
    private final BookingUseCase useCase;

    @PostMapping
    public ResponseEntity<?> createBooking(@RequestBody InputRequest request) {
        Booking booking = useCase.createBooking(InputRequest.toDomain(request));
        BookingResponse response = BookingResponse.builder()
                .comments(booking.getComments())
                .flightDate(booking.getFlyDate())
                .user(UserResponse.builder()
                        .name(booking.getUser().getName())
                        .lastName(booking.getUser().getLastName())
                        .build())
                .flight(FlightResponse.builder()
                        .destiny(booking.getFlight().getDestiny())
                        .build())
                .build();
        return ResponseEntity.ok(OutputResponse.builder()
                .message("Reserva realizada correctamente.")
                .data(response)
                .status(HttpStatus.CREATED)
                .build()
        );
    }
}
