package com.example.airlinetest.infrastructure.repository.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "bookings")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookingE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String comments;

    private Date flyDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private UserE user;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "flight_id")
    private FlightE flight;
}
