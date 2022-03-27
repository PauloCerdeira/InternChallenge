package com.challenge.intern_challenge.model;

import java.security.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Trades {
    
    @Id
    @GeneratedValue()
    private Long id;
    private long order_id;
    private Timestamp time;
    private Long quantity;
    private Double price;

    public Trades(Long order_id, Timestamp time, Long quantity, Double price) {
        this.order_id = order_id;
        this.time = time;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId () {
        return id;
    }
    public Long getOrder_id () {
        return order_id;
    }
    public Timestamp getTime () {
        return time;
    }
    public Long quantity () {
        return quantity;
    }
    public Double price () {
        return price;
    }
}
