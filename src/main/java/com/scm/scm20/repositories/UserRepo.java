package com.scm.scm20.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.scm20.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
    // Define custom query methods if needed
    // For example, findByEmail, findByName, etc.

    Optional<User> findByEmail(String email);
    Optional<User>  findByPhoneNumber(String phoneNumber);

}
