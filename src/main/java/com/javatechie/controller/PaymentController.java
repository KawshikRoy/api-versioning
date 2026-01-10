package com.javatechie.controller;

import com.javatechie.dto.PaymentMethod;
import com.javatechie.dto.PaymentV1;
import com.javatechie.dto.PaymentV2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    //path based versioning

    @GetMapping(params = "version=1")
    public PaymentV1 getPaymentV1() {
        //Assume : Real business logic executed here
        return new PaymentV1(
                500,
                "INR",
                "UPI"
        );
    }

    @GetMapping(params = "version=2")
    public PaymentV2 getPaymentV2() {
        //Assume : Real business logic executed here
        return new PaymentV2(
                500,
                "INR",
                25,
                "PARTIAL_REFUND",
                new PaymentMethod("UPI", "GooglePay")
        );
    }

    // path segementation versioning
    // header versioning
    // parm versioning


}
