package com.example.airlinetest.domain;

import com.example.airlinetest.domain.gateways.BookingRepository;
import com.example.airlinetest.domain.model.Booking;
import com.example.airlinetest.domain.model.Flight;
import com.example.airlinetest.domain.model.User;

public class BookingUseCase {
    private final BookingRepository repository;
    private final UserUseCase userUseCase;
    private final FlightUseCase flightUseCase;

    public BookingUseCase(BookingRepository repository, UserUseCase userUseCase, FlightUseCase flightUseCase) {
        this.repository = repository;
        this.userUseCase = userUseCase;
        this.flightUseCase = flightUseCase;
    }

    public Booking createBooking(Booking booking) {
        User userAux = userUseCase.create(booking.getUser());
        Flight flightAux = flightUseCase.create(booking.getFlight());
        booking.setUser(userAux);
        booking.setFlight(flightAux);
        return repository.save(booking);
    }
}
