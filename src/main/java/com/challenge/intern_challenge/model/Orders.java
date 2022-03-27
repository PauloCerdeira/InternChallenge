package com.challenge.intern_challenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders {
    
    @Id
    @GeneratedValue()
    private Long id;
    private String ticker;
    private String trader_code;

    public Orders(String ticker, String trader_code) {
        this.ticker = ticker;
        this.trader_code = trader_code;
    }

    public Long getId () {
        return id;
    }
    
    public String getTicker () {
        return ticker;
    }

    public String getTrader_code () {
        return trader_code;
    }

}
