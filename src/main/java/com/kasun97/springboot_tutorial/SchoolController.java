package com.kasun97.springboot_tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {

    private SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/schools")
    public SchoolDto createSchool(
            @RequestBody SchoolDto schoolDto
    ){
        var school = toSchool(schoolDto);
        var savedSchool = schoolRepository.save(school);
        return toSchoolDto(savedSchool);
    }

    // school dto for saved the object
    private School toSchool(SchoolDto schoolDto){
        var school = new School();
        school.setSchoolName(schoolDto.schoolName());
        return school;
    }

    // school dto for response
    private SchoolDto toSchoolDto(School school){
        return new SchoolDto(
                school.getSchoolName()
        );
    }

    @GetMapping("/schools")
    public List<SchoolDto> findAllSchools(){
        return schoolRepository.findAll()
                .stream()
                .map(this::toSchoolDto)
                .collect(Collectors.toList());
    }
}
