package com.codercampus.Assignment11.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.BankService;

@Controller
public class BankController {
	   @Autowired
	    private BankService bankService;

	    @GetMapping("/transactions")
	    public String getTransactions(Model model) throws IOException {
	        List<Transaction> transactions = bankService.getAllTransactions();
	        model.addAttribute("transactions", transactions);
	        return "transactions";
	    }

	    @GetMapping("/transactions/{transactionId}")
	    public String getTransactionDetails(@PathVariable Long transactionId, Model model) {
	        Transaction transaction = bankService.getTransactionById(transactionId);
	        model.addAttribute("transaction", transaction);
	        return "transaction-details";
	    }
	}
	
	


//	@Autowired
//	private TransactionRepository transactionRepository;
//
//	@GetMapping("/transactions")
//	public String getTransactions(Model model) throws IOException {
//		List<Transaction> transactions = transactionRepository.findAll();
//		model.addAttribute("transactions", transactions);
//		return "transactions";
//	}
//
//	@GetMapping("/transactions/{transactionId}")
//	public String getTransactionDetails(@PathVariable Long transactionId, Model model) {
//
//		Transaction transaction = transactionRepository.findById(transactionId);
//
//		model.addAttribute("transaction", transaction);
//
//		return "transaction-details";
//	}
//
//}
