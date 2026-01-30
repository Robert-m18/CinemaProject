package pl.test;

import java.util.LinkedList;

public class Ticket {
    private final Screening screening;
    private final LinkedList<Seat> seats;
    private final double cena;

    public Ticket(Screening screening, LinkedList<Seat> seats, double cena) {
        this.screening = screening;
        this.seats = seats;
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket:\n");
        sb.append("Film: ").append(screening.getFilm().getTytul()).append("\n");
        sb.append("Miejsca: ");

        for (Seat seat : seats) {
            sb.append(seat.getSeat()).append(" ");
        }

        sb.append("\nCena: ").append(cena);
        return sb.toString();
    }
}
