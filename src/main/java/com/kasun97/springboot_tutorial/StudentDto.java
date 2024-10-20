package com.kasun97.springboot_tutorial;

public record StudentDto(
        String firstName,
        String lastName,
        String email,
        Integer schoolId
) {

}
