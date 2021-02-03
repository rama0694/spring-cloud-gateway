package com.microservice.ps.api.service;

import com.microservice.ps.api.entity.Payment;
import com.microservice.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.UUID.randomUUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        payment.setTransactionId(randomUUID().toString());
        return repository.save(payment);
    }

}
