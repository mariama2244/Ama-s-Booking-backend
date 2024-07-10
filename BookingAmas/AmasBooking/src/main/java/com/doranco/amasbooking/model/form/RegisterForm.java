package com.doranco.amasbooking.model.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterForm {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String cpassword;
    private String civility;

    @Override
    public String toString() {
        return "AuthForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cpassword='" + cpassword + '\'' +
                ", civility='" + civility + '\'' +
                '}';
    }
}
