package com.scm.scm20.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity representing a contact belonging to a user in the Smart Contact Manager.
 * Each contact can have multiple social links and is associated with a user.
 */
@Entity
public class Contact {

    /** Unique identifier for the contact. */
    @Id
    private String id;
    /** Name of the contact. */
    private String name;
    /** Email address of the contact. */
    private String email;
    /** Phone number of the contact. */
    private String phoneNumber;
    /** Physical address of the contact. */
    private String address;
    /** Profile picture URL or path. */
    private String picture;
    /** Description or notes about the contact. */
    private String description;
    /** Whether this contact is marked as a favorite. */
    private boolean favorite=false;

    /**
     * List of social links for the contact (e.g., LinkedIn, Twitter URLs).
     * Not persisted as a separate entity in this model.
     */
    private List<String> socialLinkList= new ArrayList<>();

    /**
     * Many contacts can belong to one user.
     */
    @ManyToOne
    private User user;

}
