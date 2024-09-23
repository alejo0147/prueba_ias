package com.example.airlinetest.infrastructure.repository.database;

import com.example.airlinetest.infrastructure.repository.database.entity.UserE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbUserRepository extends JpaRepository<UserE, Long> {
}
