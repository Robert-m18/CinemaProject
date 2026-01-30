package pl.test;

public class PaymentService {
    private final String payment;

    public PaymentService(String payment) {
        this.payment = payment;
    }


    public PaymentMethod pay(){
        return PaymentType.valueOf(payment.toUpperCase()).create();
    }
}
