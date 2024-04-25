package com.example.app.backend;

import com.example.app.backend.entities.Payment;
import com.example.app.backend.entities.PaymentStatus;
import com.example.app.backend.entities.PaymentType;
import com.example.app.backend.entities.Student;
import com.example.app.backend.repository.PaymentRepository;
import com.example.app.backend.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class BackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository,
//                                        PaymentRepository paymentRepository) {
//        return args -> {
//            studentRepository.save(
//                    Student.builder()
//                            .id(UUID.randomUUID().toString())
//                            .firstName("Mohamed")
//                            .code("112233")
//                            .programId("BDCC")
//                            .build());
//            studentRepository.save(
//                    Student.builder()
//                            .id(UUID.randomUUID().toString())
//                            .firstName("Omar")
//                            .code("4557874")
//                            .programId("BDCC")
//                            .build());
//            studentRepository.save(
//                    Student.builder()
//                            .id(UUID.randomUUID().toString())
//                            .firstName("Mohamed")
//                            .code("546548")
//                            .programId("SDIA")
//                            .build());
//            studentRepository.save(
//                    Student.builder()
//                            .id(UUID.randomUUID().toString())
//                            .firstName("Mohamed")
//                            .code("964500")
//                            .programId("SDIA")
//                            .build());
//
//            PaymentType[] paymentTypes = PaymentType.values();
//            Random random = new Random();
//
//            studentRepository.findAll().forEach(student -> {
//                for (int i = 0; i < 5; i++) {
//                    int randomIndexForPaymentType = random.nextInt(paymentTypes.length);
//                    Payment payment = Payment.builder()
//                            .amount(1000 + (int)(Math.random() + 20000))
//                            .type(paymentTypes[randomIndexForPaymentType])
//                            .status(PaymentStatus.CREATED)
//                            .date(LocalDate.now())
//                            .student(student)
//                            .build();
//
//                    paymentRepository.save(payment);
//                }
//            });
//        };
//    }
}
