package pl.test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CinemaHall {
    private final int numerSali;
    private final List<Seat> miejsca = new ArrayList<>();

    public CinemaHall(int numerSali) {
        this.numerSali = numerSali;
        for (int i = 0; i< 50; i++){
            miejsca.add(new Seat((i+1), false));
        }
    }


    void checkSeats(){
        System.out.printf("%s: ", "Wolne miejsca");
     for (Seat s : this.miejsca){
       if (!s.isCzyZajete()){
           System.out.printf("%d,", s.getSeat());
       }
     }

        System.out.printf("%s: ", "Zajęte miejsca");
        for (Seat s : this.miejsca){
            if (s.isCzyZajete()){
                System.out.printf("%d,", s.getSeat());
            }
        }
    }

    public int getNumerSali() {
        return numerSali;
    }

    public List<Seat> getMiejsca() {
        return miejsca;
    }
}
