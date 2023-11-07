/**
 * Created By Krishna Shinde
 * Date : 07-11-2023
 * Time : 20:51
 * Project: RestApiApplication
 **/

package com.restapi.RestApiApplication.service;

import com.restapi.RestApiApplication.model.Student;
import com.restapi.RestApiApplication.repository.StudentRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepository;

    public Student saveStudent(Student student) {
     return studentRepository.save(student);
    }

    public Optional<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }
}