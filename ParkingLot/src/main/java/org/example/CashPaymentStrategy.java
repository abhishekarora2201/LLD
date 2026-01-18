package org.example;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cash received for amount:" + amount);
        return true;
    }
}
