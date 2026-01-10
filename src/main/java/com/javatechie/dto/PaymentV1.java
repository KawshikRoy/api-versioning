package com.javatechie.dto;

public record PaymentV1(
        double amount,
        String currency,
        String paymentMethod
) {}
