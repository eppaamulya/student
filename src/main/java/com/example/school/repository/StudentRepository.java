// Write your code here
package com.example.school.repository;

import java.util.*;
import com.example.school.model.Student;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student addStudent(Student student);
    String addBulkStudent(ArrayList<Student> students);

    Student getStudentById(int studentId);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

}
