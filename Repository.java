package com.example.repository;

import com.example.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Student,Integer> {
    public Student findById(int id);

}
