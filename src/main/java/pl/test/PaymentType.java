package pl.test;

import java.util.function.Supplier;

public enum PaymentType {
    CARD(CardPayment::new);


    private final Supplier<PaymentMethod> creator;

    PaymentType(Supplier<PaymentMethod> creator) {
        this.creator = creator;
    }

    public PaymentMethod create(){
       return creator.get();
    }
}
