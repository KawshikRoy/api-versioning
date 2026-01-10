package com.javatechie.dto;

public record PaymentMethod(
        String type,
        String provider
) {}