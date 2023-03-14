package com.outboxpayment.repository;

import com.outboxpayment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInterface extends JpaRepository<Payment, Integer> {
}
