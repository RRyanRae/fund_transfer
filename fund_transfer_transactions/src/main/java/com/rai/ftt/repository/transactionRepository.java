package com.rai.ftt.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rai.ftt.model.transaction;

@Repository
public interface transactionRepository extends MongoRepository<transaction, String> {
	
	@Query(value="{transactionId: ?0}")
	transaction findBytransactionId(String transactionId);

}
 