package com.example.airlinetest.domain;

import com.example.airlinetest.domain.gateways.BookingRepository;
import com.example.airlinetest.domain.model.Booking;
import com.example.airlinetest.domain.model.Flight;
import com.example.airlinetest.domain.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class BookingUseCaseTest {
    @Mock
    private BookingRepository repository;

    @Test
    public void testCreateBooking() {
        Booking bookingExpected = Booking.builder()
                .id(1L)
                .comments("A tiempo")
                .flyDate(Date.valueOf("2024-09-21"))
                .user(User.builder()
                        .id(1L)
                        .name("Oscar")
                        .lastName("Arango")
                        .build())
                .flight(Flight.builder()
                        .id(1L)
                        .destiny("Quito")
                        .build())
                .build();
        when(repository.save(any(Booking.class))).then(new Answer<Booking>() {
            @Override
            public Booking answer(InvocationOnMock invocationOnMock) throws Throwable {
                Long id = 1L;
                return Booking.builder()
                        .id(id)
                        .comments("A tiempo")
                        .flyDate(Date.valueOf("2024-09-21"))
                        .user(User.builder()
                                .id(1L)
                                .name("Oscar")
                                .lastName("Arango")
                                .build())
                        .flight(Flight.builder()
                                .id(1L)
                                .destiny("Quito")
                                .build())
                        .build();
            }
        });

        Booking bookingActual = repository.save(bookingExpected);

        assertEquals(bookingExpected.getId(), bookingActual.getId());
    }
}