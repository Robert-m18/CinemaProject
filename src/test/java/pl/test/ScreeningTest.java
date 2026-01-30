package pl.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ScreeningTest {
    @Test
    void shouldntCreateAScreening() {

         assertThrows(IllegalArgumentException.class, ()->{
             Movie film = new Movie("", "1h 30min", 14);
             CinemaHall sala = null;
             Screening seans = new Screening(film, sala, film.getCzasTrwania());
         });
    }

}