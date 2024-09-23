package com.example.airlinetest.domain.model;

import com.example.airlinetest.infrastructure.repository.database.entity.UserE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastName;

    public static UserE toEntity(User user) {
        return UserE.builder()
                .name(user.getName())
                .lastName(user.getLastName())
                .build();
    }

    public static User toDomain(UserE user) {
        return User.builder()
                .id(user.getId())
                .name(user.getName())
                .lastName(user.getLastName())
                .build();
    }
}
