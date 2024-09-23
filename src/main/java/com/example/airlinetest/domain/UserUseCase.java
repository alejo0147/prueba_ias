package com.example.airlinetest.domain;

import com.example.airlinetest.domain.gateways.UserRepository;
import com.example.airlinetest.domain.model.User;

public class UserUseCase {
    private final UserRepository repository;

    public UserUseCase(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }
}
