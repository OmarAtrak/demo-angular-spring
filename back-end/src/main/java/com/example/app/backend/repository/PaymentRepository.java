package com.example.app.backend.repository;

import com.example.app.backend.entities.Payment;
import com.example.app.backend.entities.PaymentStatus;
import com.example.app.backend.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findOneById(Long id);
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
}
