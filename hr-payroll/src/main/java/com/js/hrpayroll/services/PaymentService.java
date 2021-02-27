package com.js.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.js.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment("Jhon", 200.00, days);
	}
}
