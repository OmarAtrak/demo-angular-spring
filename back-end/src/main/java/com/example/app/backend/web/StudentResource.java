package com.example.app.backend.web;

import com.example.app.backend.entities.Student;
import com.example.app.backend.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students/")
public class StudentResource {
    private StudentService studentService;

    @Autowired
    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("save")
    public Student save(Student student) {
        return this.studentService.save(student);
    }

    @GetMapping("index")
    public List<Student> index() {
        return this.studentService.getAll();
    }

    @GetMapping("get/{code}")
    public Student getByCode(@PathVariable("code") String code) {
        return this.studentService.getByCode(code);
    }

    @GetMapping("programId/{programId}")
    public List<Student> getByProgramId(@PathVariable("programId") String code) {
        return this.studentService.getAllByProgramId(code);
    }

}
