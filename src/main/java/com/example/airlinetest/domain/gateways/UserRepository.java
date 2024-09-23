package com.example.airlinetest.domain.gateways;

import com.example.airlinetest.domain.model.User;

public interface UserRepository {
    User save(User user);
}
