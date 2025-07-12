package com.scm.scm20.services;

import java.util.List;
import java.util.Optional;

import com.scm.scm20.entities.User;

/**
 * Service interface for user-related business logic.
 * Defines methods for CRUD operations and user queries.
 */
public interface UserServices {

    /**
     * Saves a new user to the database.
     * @param user the user entity to save
     * @return the saved user entity
     */
    User saveUser(User user);
    /**
     * Retrieves a user by their ID.
     * @param id the user ID
     * @return an Optional containing the user if found
     */
    Optional <User> getUserById(String id);
    /**
     * Retrieves all users from the database.
     * @return a list of all users
     */
    List<User> getAllUsers();
    /**
     * Deletes a user by their ID.
     * @param id the user ID
     */
    void deleteUser(String id);
    /**
     * Updates a user by their ID.
     * @param id the user ID
     * @param user the updated user data
     * @return an Optional containing the updated user if found
     */
    Optional<User> updateUser(String id, User user);
    /**
     * Checks if a user exists by their email address.
     * @param email the user's email
     * @return true if user exists, false otherwise
     */
    boolean existsByEmail(String email);
    /**
     * Checks if a user exists by their phone number.
     * @param phoneNumber the user's phone number
     * @return true if user exists, false otherwise
     */
    boolean existsByPhoneNumber(String phoneNumber);
    /**
     * Checks if a user exists by their ID.
     * @param id the user ID
     * @return true if user exists, false otherwise
     */
    boolean isUserExist(String id);
}
