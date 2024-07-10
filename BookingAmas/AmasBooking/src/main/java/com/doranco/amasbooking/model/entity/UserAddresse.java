package com.doranco.amasbooking.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAddresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private float number;
    @Column
    private float street;
    @Column
    private String city;
    @Column
    private String postalCode;
    @Column
    private String department;
    @Column
    private String country;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "UserAddresse{" +
                "id=" + id +
                ", number=" + number +
                ", street=" + street +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", department='" + department + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
