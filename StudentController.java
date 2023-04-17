package com.example.Controller;

import com.example.Service;
import com.example.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    public Service service;




    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
    service.addStudent(student);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") int id){
       Student student= service.getStudentById(id);
       return student;
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        List<Student> students=service.getAllStudent();
        return students;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        service.deleteStudent(id);
    }
    @PutMapping("/update/{id}")
    public Student update(@RequestBody Student student,@PathVariable("id") int id){
     Student student1= service.updateStudent(student, id);
    return student1;
    }
}
