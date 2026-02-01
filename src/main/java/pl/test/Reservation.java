package pl.test;

import java.util.List;

import java.util.LinkedList;

public class Reservation {
    private final Customer klient;
    private final Screening seans;
    private final List<Seat> selectedSeats;
    private Status status;

    public Reservation(Customer klient, Screening seans, List<Seat> selectedSeats, Status status) {
        this.klient = klient;
        this.seans = seans;
        this.selectedSeats = selectedSeats;
        this.status = status;
    }

    public Customer getKlient() {
        return klient;
    }

    public Screening getSeans() {
        return seans;
    }

    public List<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
