package com.thamil.dao;

import com.thamil.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("dummydata")
public class DummyDataStudentDao implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {{
            put(1, new Student(1, "Thamil", "Tamil"));
            put(2, new Student(2, "Charan", "Maths"));
            put(3, new Student(3, "Hari", "Social"));
            put(4, new Student(4, "Priya", "Computer"));
        }};
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id)
    {
        return this.students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudentById(Student stud) {
        Student st = students.get(stud.getId());
        st.setName(stud.getName());
        st.setCourse(stud.getCourse());
        students.put(stud.getId(),stud);
    }

    @Override
    public void insertStudent(Student stud) {
        this.students.put(stud.getId(),stud);
    }
}
