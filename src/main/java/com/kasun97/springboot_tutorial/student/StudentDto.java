package com.kasun97.springboot_tutorial.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "first name can't be empty")
        String firstName,
        @NotEmpty(message = "last name can't be empty")
        String lastName,
        String email,
        Integer schoolId
) {

}
