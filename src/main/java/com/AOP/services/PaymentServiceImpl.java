package com.AOP.services;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment() {
        System.out.println("Amount Debited..");
    }
}
