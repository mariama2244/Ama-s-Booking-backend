package com.doranco.amasbooking.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @JsonIgnore
    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false)
    private String civility;

    @Getter
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    Set<Reservation> reservations;

    @OneToOne
    private Message message;

    @OneToOne
    private UserAddresse userAddresse;

    @OneToOne
    private Review review;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", civility='" + civility + '\'' +
                '}';
    }
}
