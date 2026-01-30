package pl.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void ShouldntCreateAMovie(){
        assertThrows(IllegalArgumentException.class, () ->
                new Movie("", "", 12)
        );

    }

}