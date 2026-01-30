package pl.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ReservationServiceTest {

    @Test
    void shouldMarkSeatsAsSelected() {
        Movie starWars = new Movie("Star Wars", "1h 20min", 13);
        CinemaHall sala = new CinemaHall(1);
        Screening seans = new Screening(starWars, sala, starWars.getCzasTrwania());
        Customer klient = new Customer("Robert Moczygęba", "rmoczygeba@gmail.com");


        LinkedList<Seat> selectedSeats = new LinkedList<>();
        Seat seat1 = new Seat(1, false);
        Seat seat2 = new Seat(2, false);
        selectedSeats.add(seat1);
        selectedSeats.add(seat2);
        Reservation reservation = new Reservation(klient, seans, selectedSeats, Status.NOWA);
        ReservationService reservationService = new ReservationService(reservation);

        reservationService.confirmReservation();

        assertTrue(seat1.isCzyZajete(), "The seat1 must be reserved");
        assertTrue(seat2.isCzyZajete(), "The seat2 must be reserved");

        assertEquals(Status.OPLACONA, reservation.getStatus());
    }

    @Test
    void shouldntMarkSeatsAsSelectedIfItstAllreadyMarked(){
        Movie starWars = new Movie("Star Wars", "1h 20min", 13);
        CinemaHall sala = new CinemaHall(1);
        Screening seans = new Screening(starWars, sala, starWars.getCzasTrwania());
        Customer klient = new Customer("Robert Moczygęba", "rmoczygeba@gmail.com");
        LinkedList<Seat> seats = new LinkedList<>();
        Seat seat = new Seat(1, true);
        Reservation reservation = new Reservation(klient, seans, seats, Status.NOWA);
        ReservationService reservationService = new ReservationService(reservation);
        seats.add(seat);
        assertThrows(IllegalStateException.class, () ->
                reservationService.confirmReservation()
        );

    }

}