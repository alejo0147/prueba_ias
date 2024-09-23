package com.example.airlinetest.infrastructure.repository.database;

import com.example.airlinetest.infrastructure.repository.database.entity.BookingE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbBookingRepository extends JpaRepository<BookingE, Long> {
}
