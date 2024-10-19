package com.kasun97.springboot_tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School , Integer> {
}
