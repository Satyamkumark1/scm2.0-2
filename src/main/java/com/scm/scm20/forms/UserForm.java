package com.scm.scm20.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Data Transfer Object (DTO) for user registration form.
 * Used to capture user input from the registration page.
 */
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class UserForm {
    /** User's full name */
    private String name;
    /** User's email address */
    private String email;
    /** User's phone number */
    private String phoneNumber;
    /** User's password */
    private String password;
    /** User's self-description (optional) */
    private String about;

    private String userGender;


   

    // Additional fields can be added as needed

}
