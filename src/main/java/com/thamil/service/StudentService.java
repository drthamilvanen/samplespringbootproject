package com.thamil.service;

import com.thamil.dao.StudentDao;
import com.thamil.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentDao studendao;

    public Collection<Student> getAllStudents(){
        return studendao.getAllStudents();
    }
    public Student getStudentById(int id)
    {
        return studendao.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.studendao.deleteStudentById(id);
    }

    public void updateStudentById(Student stud) {
        this.studendao.updateStudentById(stud);
    }

    public void insertStudent(Student stud) {
        this.studendao.insertStudent(stud);
    }
}
