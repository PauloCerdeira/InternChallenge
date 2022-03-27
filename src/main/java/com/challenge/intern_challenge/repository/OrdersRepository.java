package com.challenge.intern_challenge.repository;

import com.challenge.intern_challenge.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {
    
}
