package com.javatechie.dto;

public record PaymentV2(
        double amount,
        String currency,
        double tax,
        String refundPolicy,
        PaymentMethod paymentMethod
) {}