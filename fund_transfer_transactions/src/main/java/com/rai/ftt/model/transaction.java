package com.rai.ftt.model;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "fund_transfer_transactions")
public class transaction {

	@Field
	ObjectId _id;
	
	
	@Field
	public String transactionId;
	@Field
	public String sourceAccountNumber;
	@Field
	public String destinationAccountNumber;
	@Field
	public int amount;
	


	public transaction(ObjectId _id, String transactionId, String sourceAccountNumber, String destinationAccountNumber,
			int amount) {
		super();
		this._id = _id;
		this.transactionId = transactionId;
		this.sourceAccountNumber = sourceAccountNumber;
		this.destinationAccountNumber = destinationAccountNumber;
		this.amount = amount;
	}
		
	public transaction() {}
	
	
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getSourceAccountNumber() {
		return sourceAccountNumber;
	}

	public void setSourceAccountNumber(String sourceAccountNumber) {
		this.sourceAccountNumber = sourceAccountNumber;
	}

	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(String destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "transaction [_id=" + _id + ", transactionId=" + transactionId + ", sourceAccountNumber="
				+ sourceAccountNumber + ", destinationAccountNumber=" + destinationAccountNumber + ", amount=" + amount
				+ "]";
	}

	

}
