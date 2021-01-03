package com.thamil.controller;

import com.thamil.entity.Student;
import com.thamil.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("/school")
public class StudentController {
    @Autowired
    private StudentService studentservice;

    @GetMapping("/students")
    public Collection<Student> getAllEmployees(){
        return studentservice.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentservice.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable int id)
    {
        studentservice.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudentById(@RequestBody Student stud)
    {
        studentservice.updateStudentById(stud);
    }

    @PostMapping
    public void insertStudent(@RequestBody Student stud)
    {
        studentservice.insertStudent(stud);
    }
}
