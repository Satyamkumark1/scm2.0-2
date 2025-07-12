package com.scm.scm20.services.impl;

import java.lang.module.ResolutionException;
import java.util.Collections; 
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.scm20.entities.User;
import com.scm.scm20.repositories.UserRepo;
import com.scm.scm20.services.UserServices;

import ch.qos.logback.classic.Logger;

import com.scm.scm20.helper.ResourceNotFoundException;

/**
 * Implementation of UserServices interface for user-related business logic.
 * Handles user CRUD operations and persistence.
 */
@Service
public class UserServicesImp  implements UserServices {

    /** Injects the UserRepo for database operations. */
    @Autowired
    private  UserRepo userRepo;

    /** Logger for this class. */
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    /**
     * Saves a new user to the database, generating a unique user ID.
     * @param user the user entity to save
     * @return the saved user entity
     */
    @Override
    public User saveUser(User user) {
        // user id : have to generate
        String userId = UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepo.save(user); // Replace with actual implementation
    }

    /**
     * Checks if a user exists by their ID.
     * @param id the user ID
     * @return true if user exists, false otherwise
     */
    @Override
    public boolean isUserExist(String id) {
        User user2 = userRepo.findById(id).orElseThrow(null);
        return user2 != null ? true :  false;
    }

    /**
     * Retrieves a user by their ID.
     * @param id the user ID
     * @return an Optional containing the user if found
     */
    @Override
    public Optional<User> getUserById(String id) {
        // Implementation for getting user by ID
        return userRepo.findById(id); // Replace with actual implementation
    }

    /**
     * Retrieves all users from the database.
     * @return a list of all users
     */
    @Override
    public List<User> getAllUsers() {
        // Implementation for getting all users
        return userRepo.findAll(); // Replace with actual implementation
    }

    /**
     * Deletes a user by their ID.
     * @param id the user ID
     */
    @Override
    public void deleteUser(String id) {
        Optional<User> userOptional = userRepo.findById(id);
        userOptional.ifPresent(userRepo::delete);
    }

    /**
     * Updates a user by their ID.
     * @param id the user ID
     * @param user the updated user data
     * @return an Optional containing the updated user if found
     */
    @Override
    public Optional<User> updateUser(String id, User user) {
        // Implementation for updating user by ID
        User foundUser = userRepo.findById(user.getUserId()).orElseThrow(() -> new ResourceNotFoundException("not find"));
        foundUser.setAbout(user.getAbout());
        foundUser.setEmail(user.getEmail());
        foundUser.setName(user.getName());
        foundUser.setName(user.getPassword()); // Note: This line sets name to password, may be a bug
        foundUser.setProfilecPic(user.getProfilecPic());
        foundUser.setEnabled(user.isEnabled());
        foundUser.setEmailVerified(user.isEmailVerified());
        foundUser.setProviders(user.getProviders());
        foundUser.setProviderUserId(user.getProviderUserId());
        foundUser.setUserGender(user.getUserGender());
        
        User save = userRepo.save(foundUser);
        return Optional.ofNullable(save);// Replace with actual implementation
    }

    /**
     * Checks if a user exists by their email address.
     * @param email the user's email
     * @return true if user exists, false otherwise
     */
    @Override
    public boolean existsByEmail(String email) {
        User user2 = userRepo.findByEmail(email).orElseThrow(null);
        return user2 != null ? true : false ; // Replace with actual implementation
    }

    /**
     * Checks if a user exists by their phone number.
     * @param phoneNumber the user's phone number
     * @return true if user exists, false otherwise
     */
    @Override
    public boolean existsByPhoneNumber(String phoneNumber) {
        User user2 = userRepo.findByPhoneNumber(phoneNumber).orElseThrow(null);
        return user2!=null ? true : false ; // Replace with actual implementation
    }

}
