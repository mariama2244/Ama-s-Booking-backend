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
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String text;
    @Column
    private byte rate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    private Room room;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rate=" + rate +
                '}';
    }
}
