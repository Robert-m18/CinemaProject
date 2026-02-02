package pl.test;

import java.util.InputMismatchException;
import java.util.LinkedList;

import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        Movie starWars = new Movie("Star Wars", "1h 20min", 13);
        CinemaHall sala = new CinemaHall(1);
        Screening seans = new Screening(starWars, sala, starWars.getCzasTrwania());
        Customer klient = new Customer("Robert Moczygęba", "rmoczygeba@gmail.com");


        List<Seat> wybraneSeats = new LinkedList<>();
        do {
            wybraneSeats.clear();
            while (true) {

                System.out.print("\nPodaj numer miejsca (1-50): ");
                int numer;
             try {
                 numer = sc.nextInt();

                 try {
                     validateAndAddSeat(sala, numer, wybraneSeats);
                 } catch (InvalidSeatException e) {
                     System.out.println(e.getMessage());
                 }

             }catch (InvalidSeatException e){
                 System.out.println(e.getMessage());
                 sc.nextLine();
                 continue;
             }catch (InputMismatchException e){
                 System.out.println("Proszę wprowadzić poparawny numer miejsca (1-50)");
                 sc.nextLine();
                 continue;
             }

                sc.nextLine();
                System.out.println("Czy chcesz dodać kolejne miejsce? (Tak/Nie)");
                if (!opcja(sc)) break;
            }


            Reservation reservation = new Reservation(klient, seans, wybraneSeats, Status.NOWA);
            ReservationService service = new ReservationService(reservation);

            service.confirmReservation();

            // Płatność (przykład z kartą)
            PaymentService paymentservice = new PaymentService("card");
            PaymentMethod payment = paymentservice.pay();
            double cena = 24.50;
            payment.pay(cena);
            System.out.println();

            // Tworzymy i wypisujemy bilet
            Ticket ticket = new Ticket(seans, wybraneSeats, cena);
            System.out.println(ticket);


            System.out.println("Czy chcesz zarejestrować kolejny bilet?");
        } while (opcja(sc));
    }


    static boolean opcja(Scanner sc) {
        while (true) {
            String wybor = sc.nextLine();
            if (wybor.equalsIgnoreCase("Tak")) {
                return true;
            } else if (wybor.equalsIgnoreCase("Nie")) {
                return false;
            } else {
                System.out.println("Niepoprawny wybór, wpisz Tak lub Nie:");
            }
        }
    }
    private static Seat findSeat(CinemaHall sala, int numer) {
        return sala.getMiejsca()
                .stream()
                .filter(seat -> seat.getSeat() == numer)
                .findFirst()
                .orElseThrow(() ->
                        new InvalidSeatException("Nie ma takiego miejsca: " + numer)
                );
    }
    private static void validateAvailability(Seat seat) {
        if (seat.isCzyZajete()) {
            throw new InvalidSeatException(
                    "Miejsce " + seat.getSeat() + " jest już zajęte"
            );
        }
    }
    private static void validateNotSelected(List<Seat> wybraneSeats, Seat seat) {
        if (wybraneSeats.contains(seat)) {
            throw new InvalidSeatException(
                    "Miejsce " + seat.getSeat() + " jest już wybrane"
            );
        }
        System.out.printf("Pomyślnie wybrano miejsce!%n");
    }

//seats function
    public static void validateAndAddSeat(CinemaHall sala, int numer, List<Seat> wybraneSeats) {
        if (numer < 1 || numer > 50) {
            throw new InvalidSeatException("Numer miejsca poza zakresem 1–50");
        }

        Seat seat = findSeat(sala, numer);
        validateAvailability(seat);
        validateNotSelected(wybraneSeats, seat);

        wybraneSeats.add(seat);
    }

}


