package com.rai.ftt.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rai.ftt.model.transaction;

@Repository
public interface transactionRepository extends MongoRepository<transaction, String> {
	
	@Query("{'transactionId: ?0}")
	Optional<transaction> findBytransactionId(String transactionId);

}
 