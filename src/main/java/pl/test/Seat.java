package pl.test;

public class Seat {
    private final int seat;
    private boolean czyZajete;
    public void setCzyZajete(boolean wartosc){
        this.czyZajete = wartosc;
    }
    public int getSeat() {
        return seat;
    }

    public boolean isCzyZajete() {
        return czyZajete;
    }

    public Seat(int seat, boolean czyZajete) {
        this.seat = seat;
        this.czyZajete = czyZajete;
    }
}
