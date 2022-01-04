package com.rai.ftt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rai.ftt.model.transaction;
import com.rai.ftt.repository.transactionRepository;

@Service
public class transactionService {
	
	@Autowired
	transactionRepository transactionrepo;
	
	public transactionService(transactionRepository transactionrepo) {
		this.transactionrepo = transactionrepo;
	}
	
	public void addTransaction(transaction trans) {
		transactionrepo.insert(trans);
	}
	
	public List<transaction> getTransactions(){
		return transactionrepo.findAll();
	}
	
	public transaction getOneTrans(String transactionId) {
		return transactionrepo.findBytransactionId(transactionId);
				
//				.orElseThrow(() -> new RuntimeException(
//				String.format(transactionId, "Transaction not found!")));
	}
}
