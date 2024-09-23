package com.example.airlinetest.infrastructure.repository;

import com.example.airlinetest.domain.gateways.UserRepository;
import com.example.airlinetest.domain.model.User;
import com.example.airlinetest.infrastructure.repository.database.DbUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final DbUserRepository repository;

    @Override
    @Transactional
    public User save(User user) {
        return User.toDomain(repository.save(User.toEntity(user)));
    }
}
