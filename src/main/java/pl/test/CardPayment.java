package pl.test;

public class CardPayment implements PaymentMethod{
    @Override
    public void pay(double kwota) {
        System.out.printf("%s: %.2f", "Płatność Kartą", kwota);
    }
}
