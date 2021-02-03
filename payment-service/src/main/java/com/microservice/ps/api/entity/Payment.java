package com.microservice.ps.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TB")
@Data
public class Payment {

    @Id
    @GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
}
