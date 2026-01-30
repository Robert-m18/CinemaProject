package pl.test;

import java.util.LinkedList;

public class Screening {
    private final Movie film;
    private final CinemaHall sala;
    private final String czasSeansu;


    public Screening(Movie film, CinemaHall sala, String czasSeansu)
    {
        if (film == null || sala == null || czasSeansu.isEmpty())
            throw new IllegalArgumentException("Dane seansu nie są kompletne, proszę uzupełnic wszystkie dane!");
        this.film = film;
        this.sala = sala;
        this.czasSeansu = czasSeansu;
    }

    public Movie getFilm() {
        return film;
    }

    public CinemaHall getSala() {
        return sala;
    }

    public String getCzasSeansu() {
        return czasSeansu;
    }

    @Override
    public String toString() {
        return "Seans{" +
                "\nfilm=" + film +
                "\n, sala=" + sala.getNumerSali() +
                "\n, czas Seansu='" + czasSeansu + '\'';
    }

}

