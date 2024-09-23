package com.example.airlinetest.domain.gateways;

import com.example.airlinetest.domain.model.Booking;

public interface BookingRepository {
    Booking save(Booking booking);
}
