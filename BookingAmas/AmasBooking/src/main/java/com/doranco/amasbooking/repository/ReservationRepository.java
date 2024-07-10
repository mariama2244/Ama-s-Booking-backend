package com.doranco.amasbooking.repository;

import com.doranco.amasbooking.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
