package com.scm.scm20.controller;
// Importing necessary classes for Spring MVC and application logic
import org.springframework.ui.Model;
import com.scm.scm20.entities.User;
import com.scm.scm20.forms.UserForm;
import com.scm.scm20.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Marks this class as a Spring MVC Controller
@Controller
public class PageController {

    // Injects the UserServices bean for user-related operations
    @Autowired
    private UserServices userServices;

    // Handles GET requests to '/home' and returns the 'home' view
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    // Handles GET requests to '/about' and returns the 'about' view
    @GetMapping("/about")
    public String about()
    {
        return "about";
    }

    // Handles GET requests to '/services' and returns the 'services' view
    @GetMapping("/services")
    public String services()
    {
        return "services";
    }

    // Handles GET requests to '/register', prepares a blank UserForm, and returns the 'register' view
    @GetMapping("/register")
    public String register(Model model)
    {
        // Create a new UserForm object to bind form data
        UserForm userForm =new UserForm();
        // Add the UserForm object to the model so it can be accessed in the view
        model.addAttribute("userForm", userForm);
        return "register";  
    }

    @GetMapping("/login")
    public String login () {
        return "login"; // Returns the login view

    }

    // Handles POST requests to '/do-register' to process user registration
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRegistration(Model model, UserForm userForm) {
        // Logic to process registration
        // Fetch user details from the form and save to database

        // Build a User entity from the submitted form data
        User user = User.builder()
        .name(userForm.getName())
        .about(userForm.getAbout())
        .email(userForm.getEmail())
        .phoneNumber(userForm.getPhoneNumber())
        .password(userForm.getPassword())
        .UserGender(userForm.getUserGender()) // Use the userGender field from UserForm
        .build();

        // Save the user using the UserServices bean
        User savedUser = userServices.saveUser(user);

        // Print the saved user to the console (for debugging)
        System.out.println(savedUser);

        // Redirect to the registration page after successful registration
        return "redirect:/register"; // Redirect to home after registration
    }

 }


