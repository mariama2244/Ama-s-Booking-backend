package com.doranco.amasbooking.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String text;
    @Column
    private Date creationDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", subject='" + text + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
