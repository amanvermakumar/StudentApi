package com.example;

import com.example.entities.Student;
import com.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;
    //get all book
    public List<Student> getAllStudent(){
        List<Student> list= (List<Student>) this.repository.findAll();
        return list;
    }

    //get single book by id
    public Student getStudentById(int id){

        return this.repository.findById(id);
    }
    public  Student addStudent(Student s){
        Student result=repository.save(s);
        return result;
    }
    //delete
    public void  deleteStudent(int id){
        repository.deleteById(id);
    }

    //update
    public Student updateStudent(Student student, int id){
        student.setId(id);
        repository.save(student);

        return student;
    }


}
