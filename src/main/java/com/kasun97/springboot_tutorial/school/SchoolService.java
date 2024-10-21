package com.kasun97.springboot_tutorial.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    private SchoolRepository schoolRepository;
    private SchoolMapper schoolMapper;

    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto createSchool(SchoolDto schoolDto){
        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool = schoolRepository.save(school);
        return schoolDto;
    }

    public List<SchoolDto> findAllSchools(){
        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }
}
