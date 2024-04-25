package com.example.app.backend.services;

import com.example.app.backend.entities.Payment;
import com.example.app.backend.entities.PaymentStatus;
import com.example.app.backend.entities.PaymentType;
import com.example.app.backend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment save(Payment payment) {
        return this.paymentRepository.save(payment);
    }

    public Payment getById(Long id) {
        return this.paymentRepository.findOneById(id);
    }

    public List<Payment> getAll() {
        return this.paymentRepository.findAll();
    }

    public List<Payment> getAllByType(PaymentType paymentType) {
        return this.paymentRepository.findByType(paymentType);
    }

    public List<Payment> getAllByStatus(PaymentStatus paymentStatus) {
        return this.paymentRepository.findByStatus(paymentStatus);
    }

    public boolean delete(Long id) {
        Payment payment = this.paymentRepository.findOneById(id);
        payment.setActive(false);
        Payment removedPayment = this.paymentRepository.save(payment);

        if(!removedPayment.isActive()) {
            return true;
        }
        return false;
    }
}
