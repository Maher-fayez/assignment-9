package com.example.eregistrar.controller;

import com.example.eregistrar.model.Student;
import com.example.eregistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping()
    public String home() {
        return "Welcome";
    }
    @GetMapping("/list")
    public String listStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "student/list";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("studentNumber", student.getStudentNumber());
        return "student/register";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("student") Student student) {
        studentRepository.save(student);
        return "redirect:/students/list";
    }
    @PostMapping("/edit/{studentId}")
    public String editStudent(@PathVariable Long studentId, @ModelAttribute("student") Student student) {
        student.setStudentId(studentId);
        studentRepository.save(student);
        return "redirect:/students/list";
    }
}
