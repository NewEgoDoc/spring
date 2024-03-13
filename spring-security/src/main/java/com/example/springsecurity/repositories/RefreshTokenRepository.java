package com.example.springsecurity.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.springsecurity.helpers.RefreshableCRUDRepository;
import com.example.springsecurity.models.RefreshToken;


@Repository
public interface RefreshTokenRepository extends RefreshableCRUDRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByToken(String token);

    RefreshToken save(RefreshToken refreshToken);

    void delete(RefreshToken token);
}
