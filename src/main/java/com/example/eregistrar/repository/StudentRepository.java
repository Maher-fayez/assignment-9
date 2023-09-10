package com.example.eregistrar.repository;

import com.example.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
