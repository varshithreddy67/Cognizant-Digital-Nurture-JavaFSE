package com.cognizant.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor processor = new PayPalAdapter();

        processor.processPayment(5000);

    }
}