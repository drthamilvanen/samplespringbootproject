package com.thamil.dao;

import com.thamil.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("mongodata")
public class MongoDBStudentDaoImpl implements StudentDao {

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>()
        {
            {
                add(new Student(1, "Siva", "QA"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudentById(Student stud) {

    }

    @Override
    public void insertStudent(Student stud) {

    }
}
