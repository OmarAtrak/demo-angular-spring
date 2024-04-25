package com.example.app.backend.web;

import com.example.app.backend.entities.Payment;
import com.example.app.backend.entities.PaymentStatus;
import com.example.app.backend.entities.PaymentType;
import com.example.app.backend.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payments/")
public class PaymentResource {
    private PaymentService paymentService;

    @Autowired
    public PaymentResource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("save")
    public Payment save(Payment payment) {
        return this.paymentService.save(payment);
    }

    @GetMapping("{id}")
    public Payment getById(@PathVariable("id") Long id) {
        return this.paymentService.getById(id);
    }

    @GetMapping("index")
    public List<Payment> index() {
        return this.paymentService.getAll();
    }

    @GetMapping("index/type")
    public List<Payment> getAllByType(@RequestParam("type") PaymentType paymentType) {
        return this.paymentService.getAllByType(paymentType);
    }

    @GetMapping("index/status")
    public List<Payment> getAllByStatus(@RequestParam("status") PaymentStatus paymentStatus) {
        return this.paymentService.getAllByStatus(paymentStatus);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return this.paymentService.delete(id);
    }
}
