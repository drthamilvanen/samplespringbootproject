package com.thamil.dao;

import com.thamil.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudentById(Student stud);

    void insertStudent(Student stud);
}
