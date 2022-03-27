package com.challenge.intern_challenge.repository;

import com.challenge.intern_challenge.model.Traders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradersRepository extends CrudRepository<Traders, Long> {
    
}
