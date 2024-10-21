package com.kasun97.springboot_tutorial.student;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from the first controller";
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(
            @RequestBody StudentDto studentDto
    ){
        return this.studentService.saveStudent(studentDto);
    }


    @GetMapping("/students")
    public List<StudentResponseDto> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/students/{student-id}")
    public StudentResponseDto findStudentById(
            @PathVariable("student-id") Integer id
    ){
        return studentService.findStudentById(id);
    }

    @GetMapping("/students/search/{student-name}")
    public List<StudentResponseDto> findStudentsByName(
            @PathVariable("student-name") String studentName
    ){
        return studentService.findStudentsByName(studentName);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(
            @PathVariable("student-id") Integer id
    ){
        studentService.deleteStudentById(id);
    }
}
