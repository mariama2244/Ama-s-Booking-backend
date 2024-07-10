package com.doranco.amasbooking.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Description {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private float number;
    @Column
    private float floorNum;
    @Column
    private String details;

    private boolean wifi;
    private boolean parking;
    private boolean animal;
    private boolean pool;
    private boolean spa;
    private boolean clim;
    private boolean kitchen;
    private boolean surface;
    private boolean bed;
    private boolean television;

    @OneToOne
    private Room room;

    @Override
    public String toString() {
        return "Description{" +
                "id=" + id +
                ", number=" + number +
                ", floorNum=" + floorNum +
                ", details='" + details + '\'' +
                ", wifi=" + wifi +
                ", parking=" + parking +
                ", animal=" + animal +
                ", pool=" + pool +
                ", spa=" + spa +
                ", clim=" + clim +
                ", kitchen=" + kitchen +
                ", surface=" + surface +
                ", bed=" + bed +
                ", television=" + television +
                '}';
    }
}
