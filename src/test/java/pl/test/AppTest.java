package pl.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static pl.test.App.opcja;
import static pl.test.App.validateAndAddSeat;


class AppTest {
Scanner sc = new Scanner(System.in);

    @Test
    void shouldThrowWhenSeatAlreadySelected() {
        CinemaHall sala = new CinemaHall(1);
        LinkedList<Seat> list = new LinkedList<>();

        validateAndAddSeat(sala, 1, list);

        assertThrows(InvalidSeatException.class, () ->
                validateAndAddSeat(sala, 1, list)
        );
    }

    @Test
    void ShouldReturnTrueAndFalse(){
        boolean result = opcja(sc);

        assertTrue(result);
    }



}












