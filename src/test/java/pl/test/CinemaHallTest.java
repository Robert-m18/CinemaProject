package pl.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaHallTest {

    @Test
    void hallShouldContains50seats(){
        CinemaHall sala = new CinemaHall(1);
        assertEquals(50, sala.getMiejsca().size());
    }




}