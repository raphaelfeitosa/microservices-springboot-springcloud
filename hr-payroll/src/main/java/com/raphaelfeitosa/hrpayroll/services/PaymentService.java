package com.raphaelfeitosa.hrpayroll.services;

import com.raphaelfeitosa.hrpayroll.entities.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {

        return new Payment("Bod", 200.00, days);
    }

}
