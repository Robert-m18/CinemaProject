package pl.test;

public class Customer {
    private final String imie;
    private final String email;

    public Customer(String imie, String email) {
        this.imie = imie;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public String getEmail() {
        return email;
    }
}
