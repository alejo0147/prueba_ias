package com.example.airlinetest.infrastructure.api.dto;

import lombok.Builder;

@Builder
public record UserResponse(String name, String lastName) {
}
