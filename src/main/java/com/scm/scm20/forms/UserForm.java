package com.scm.scm20.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class UserForm {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private String about;

    // Additional fields can be added as needed

}
