package com.kasun97.springboot_tutorial.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    // school dto for saved the object
    public School toSchool(SchoolDto schoolDto){
        var school = new School();
        school.setSchoolName(schoolDto.schoolName());
        return school;
    }

    // school dto for response
    public SchoolDto toSchoolDto(School school){
        return new SchoolDto(
                school.getSchoolName()
        );
    }
}
