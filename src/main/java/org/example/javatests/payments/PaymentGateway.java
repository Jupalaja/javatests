package org.example.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
