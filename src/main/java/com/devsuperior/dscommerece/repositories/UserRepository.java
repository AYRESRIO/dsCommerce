package com.devsuperior.dscommerece.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerece.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
