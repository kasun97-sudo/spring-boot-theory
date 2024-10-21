package com.kasun97.springboot_tutorial.student;

public record StudentResponseDto(
        String firstName,
        String lastName,
        String email
) {
}
