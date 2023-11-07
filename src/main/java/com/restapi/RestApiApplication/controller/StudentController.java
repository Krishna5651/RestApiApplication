/**
 * Created By Krishna Shinde
 * Date : 07-11-2023
 * Time : 20:50
 * Project: RestApiApplication
 **/

package com.restapi.RestApiApplication.controller;

import com.restapi.RestApiApplication.model.Student;
import com.restapi.RestApiApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/StudentDetails")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/savedata")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @GetMapping("/getData")
    public ResponseEntity<Student> getStudentData(@RequestParam String studentName) {
        Optional<Student> student = studentService.getStudentByName(studentName);
        return student.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
