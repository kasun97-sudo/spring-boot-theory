package com.kasun97.springboot_tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student , Integer> {

    List<Student> findAllByFirstNameContaining(String firstName);
}
