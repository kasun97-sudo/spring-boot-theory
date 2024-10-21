package com.kasun97.springboot_tutorial.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School , Integer> {
}
