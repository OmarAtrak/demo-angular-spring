package com.example.app.backend.repository;

import com.example.app.backend.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findOneByCode(String code);
    List<Student> findByProgramId(String programId);
}
