package com.example.airlinetest.infrastructure.repository;

import com.example.airlinetest.domain.gateways.BookingRepository;
import com.example.airlinetest.domain.model.Booking;
import com.example.airlinetest.infrastructure.repository.database.DbBookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookingRepositoryImpl implements BookingRepository {
    private final DbBookingRepository repository;

    @Override
    @Transactional
    public Booking save(Booking booking) {
        return Booking.toDomain(repository.save(Booking.toEntity(booking)));
    }
}
