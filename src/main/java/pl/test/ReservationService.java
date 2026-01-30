package pl.test;

public class    ReservationService {
    private final Reservation reservation;

    public ReservationService(Reservation reservation) {
        this.reservation = reservation;
    }

    public void confirmReservation() {
        for (Seat seat : reservation.getSelectedSeats()) {
            if (seat.isCzyZajete()) {
                throw new IllegalStateException("Miejsce " + seat.getSeat() + " jest już zajęte");
            }
            seat.setCzyZajete(true);
        }
        reservation.setStatus(Status.OPLACONA);
    }
}
