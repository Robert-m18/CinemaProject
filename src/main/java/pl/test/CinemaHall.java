package pl.test;
import java.util.LinkedList;


public class CinemaHall {
    private final int numerSali;
    private final LinkedList<Seat> miejsca = new LinkedList<>();

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

    public LinkedList<Seat> getMiejsca() {
        return miejsca;
    }
}
