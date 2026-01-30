package pl.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static pl.test.App.validateAndAddSeat;


class AppTest {


    @Test
    void shouldThrowWhenSeatAlreadySelected() {
        CinemaHall sala = new CinemaHall(1);
        LinkedList<Seat> list = new LinkedList<>();

        validateAndAddSeat(sala, 1, list);

        assertThrows(InvalidSeatException.class, () ->
                validateAndAddSeat(sala, 1, list)
        );
    }

}












