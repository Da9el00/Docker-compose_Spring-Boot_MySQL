package com.example.springgradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EmployeeEntity, Long> {
    EmployeeEntity getFirstById(Long id);
}
