package com.scm.scm20.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    private String userId;
    @Column(name = "user_name",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private  String email;
    private  String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private  String profilecPic;
    private  String phoneNumber;
    private String userGender;

    @Column(length = 1000)
    private String UserGender;

    private  boolean enabled=false;
    private  boolean emailVerified = false;
    private  boolean phoneVerfied=false;


    @Enumerated(EnumType.STRING)
    private Providers providers=Providers.SELF;
    private String providerUserId;

    // OneToMany relationship with Contact entity 
    // The mappedBy attribute indicates that the Contact entity has a field named "user" that maps to this User entity
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true) //
    private List<Contact> contactList =new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink> socialLinkList = new ArrayList<>();
}
