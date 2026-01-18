package org.example;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("UPI Server down, payment not possible");
        return false;
    }
}
