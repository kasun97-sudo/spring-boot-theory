package com.kasun97.springboot_tutorial.student;

import com.kasun97.springboot_tutorial.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    // create a transform function that related to the DTO
    public Student toStudent(StudentDto dto){
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
    public StudentResponseDto toStudentResponseDto(Student student){
        return new StudentResponseDto(
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }
}
