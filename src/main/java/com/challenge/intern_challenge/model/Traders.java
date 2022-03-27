package com.challenge.intern_challenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Traders {
    
    @Id
    @GeneratedValue()
    private Long id;
    private String code;
    private String name;

    public Traders(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Long getId () {
        return id;
    }
    
    public String getName () {
        return name;
    }

    public String getCode () {
        return code;
    }

}
