package com.example.airlinetest.infrastructure.api.dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record OutputResponse(Object data, HttpStatus status, String message) {
}
