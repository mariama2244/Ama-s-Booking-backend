package com.doranco.amasbooking.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "reservation_date")
    private Date reservationDate;
    private float amount;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    private Room room;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reservationDate=" + reservationDate +
                ", amount=" + amount +
                ", user=" + user +
                '}';
    }
}
