package com.rai.ftt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rai.ftt.model.transaction;
import com.rai.ftt.repository.transactionRepository;
import com.rai.ftt.service.transactionService;

@RestController
public class transactionController {

	@Autowired
	transactionService transService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	


	@GetMapping("/transactions")
	public ResponseEntity<List<transaction>> getTransactions() {

		return ResponseEntity.ok(transService.getTransactions());
	}

	@GetMapping("/transactions/{transactionId}")
	public ResponseEntity<transaction> getOneTrans(@PathVariable String transactionId) {
		
		
//		Query query = new Query();
//		query.addCriteria(Criteria.where(trasactionId).is(trasactionId));
		try {
		transaction trans = transService.getOneTrans(transactionId);
		return new ResponseEntity<transaction>( trans , HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity("Transaction Not found!" , HttpStatus.NOT_FOUND);	
		}
	    }
	


	@PostMapping("/newTransaction")
	public ResponseEntity<transaction> addTransactions(@RequestBody transaction trans) {
		
		 transService.addTransaction(trans);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
