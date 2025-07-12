package com.scm.scm20.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.scm20.entities.User;

/**
 * Repository interface for User entity.
 * Extends JpaRepository to provide CRUD operations and custom queries.
 */
public interface UserRepo extends JpaRepository<User, String> {
    // Define custom query methods if needed
    // For example, findByEmail, findByName, etc.

    /**
     * Find a user by their email address.
     * @param email the user's email
     * @return an Optional containing the user if found
     */
    Optional<User> findByEmail(String email);
    /**
     * Find a user by their phone number.
     * @param phoneNumber the user's phone number
     * @return an Optional containing the user if found
     */
    Optional<User>  findByPhoneNumber(String phoneNumber);

}
