package com.challenge.intern_challenge.repository;

import com.challenge.intern_challenge.model.Trades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradesRepository extends CrudRepository<Trades, Long> {
    
}
