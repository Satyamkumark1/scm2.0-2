package com.scm.scm20.services;

import java.util.List;
import java.util.Optional;

import com.scm.scm20.entities.User;

public interface UserServices {

    User saveUser(User user);
    Optional <User> getUserById(String id);
    List<User> getAllUsers();
    void deleteUser(String id);
    Optional<User> updateUser(String id, User user);
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber);
    boolean isUserExist(String id);
}
