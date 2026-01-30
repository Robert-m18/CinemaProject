package pl.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void shouldCallAMethodToPay(){
        PaymentService service = new PaymentService("card");
        PaymentMethod method = service.pay();

        assertTrue(method instanceof CardPayment);


    }

    @Test
    void shouldThrowAnExeptionIfPaymentMethodIsInvalid(){
        assertThrows(IllegalArgumentException.class, () ->
                new PaymentService("blik").pay()
        );

    }

}