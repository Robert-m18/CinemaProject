package pl.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static pl.test.App.*;


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
    void ShouldReturnTrueAndFalseAndNull(){
     assertTrue(parseOption("tak"));
     assertFalse(parseOption("Nie"));
     assertNotNull(parseOption("tAK"));
     assertNull(parseOption("ddbfxb"));
    }


@Test
    void check(){
        assertEquals(2,1);
}
}












