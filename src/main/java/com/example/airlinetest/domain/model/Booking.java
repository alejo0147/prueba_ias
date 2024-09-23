package com.example.airlinetest.domain.model;

import com.example.airlinetest.infrastructure.repository.database.entity.BookingE;
import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private Long id;
    private String comments;
    private Date flyDate;
    private User user;
    private Flight flight;

    //
    public static BookingE toEntity(Booking booking) {
        return BookingE.builder()
                .comments(booking.getComments())
                .flyDate(booking.getFlyDate())
                .user(User.toEntity(booking.getUser()))
                .flight(Flight.toEntity(booking.getFlight()))
                .build();
    }

    public static Booking toDomain(BookingE booking) {
        return Booking.builder()
                .comments(booking.getComments())
                .flyDate(booking.getFlyDate())
                .user(User.toDomain(booking.getUser()))
                .flight(Flight.toDomain(booking.getFlight()))
                .build();
    }
}
