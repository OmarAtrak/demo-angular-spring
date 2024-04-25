package com.example.app.backend.services;

import com.example.app.backend.entities.Student;
import com.example.app.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> getAll() {
        return this.studentRepository.findAll();
    }

    public Student getByCode(String code) {
        return this.studentRepository.findOneByCode(code);
    }

    public List<Student> getAllByProgramId(String programId) {
        return this.studentRepository.findByProgramId(programId);
    }
}
