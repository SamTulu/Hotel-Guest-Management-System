package edu.miu.cs.cs425.seniorproject.hotelguestmanagementsystem.service;

import edu.miu.cs.cs425.seniorproject.hotelguestmanagementsystem.model.Reservation;

import java.util.List;

public interface ReservationService {
    public Reservation makeReservation(Reservation reservation);

    public Reservation getReservation(Long reservationId);

    public List<Reservation> getAllReservations();

    public Reservation updateReservation(Reservation reservation);

    public void cancelReservation(Long reservationId);
}
