package pl.test;

import java.util.LinkedList;

public class Reservation {
    private final Customer klient;
    private final Screening seans;
    private final LinkedList<Seat> selectedSeats;
    private Status status;

    public Reservation(Customer klient, Screening seans, LinkedList<Seat> selectedSeats, Status status) {
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

    public LinkedList<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
