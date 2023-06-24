package com.codercampus.Assignment11.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class BankService {
	   @Autowired
	    private TransactionRepository transactionRepository;

	    public List<Transaction> getAllTransactions() throws IOException {
	        return transactionRepository.findAll();
	    }

	    public Transaction getTransactionById(Long transactionId) {
	        return transactionRepository.findById(transactionId);
	    }
	}


