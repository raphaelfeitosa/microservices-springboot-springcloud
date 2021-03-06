package com.raphaelfeitosa.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import com.raphaelfeitosa.hrpayroll.entities.Payment;
import com.raphaelfeitosa.hrpayroll.entities.Worker;
import com.raphaelfeitosa.hrpayroll.feignclients.WorkerFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
