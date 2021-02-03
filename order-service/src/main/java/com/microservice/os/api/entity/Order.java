package com.microservice.os.api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ORDER_TB")
public class Order {
    @Id
    private int id;
    private String name;
    private int quantity;
    private double price;
}
