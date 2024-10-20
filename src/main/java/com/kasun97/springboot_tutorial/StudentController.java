package com.kasun97.springboot_tutorial;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from the first controller";
    }

    @PostMapping("/students")
    public StudentResponseDto post(
            @RequestBody StudentDto studentDto
    ){
        var student = toStudent(studentDto);
        var savedStudent =  studentRepository.save(student);
        return toStudentResponseDto(savedStudent);
    }

    // create a transform function that related to the DTO
    private Student toStudent(StudentDto dto){
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);

        return student;
    }

    // manage student response dto
    private StudentResponseDto toStudentResponseDto(Student student){
        return new StudentResponseDto(
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }


    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id
    ){
        return studentRepository.findById(id).orElse(null);
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentsByName(
            @PathVariable("student-name") String studentName
    ){
        return studentRepository.findAllByFirstNameContaining(studentName);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(
            @PathVariable("student-id") Integer id
    ){
        studentRepository.deleteById(id);
    }
}
