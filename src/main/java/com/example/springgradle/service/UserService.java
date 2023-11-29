package com.example.springgradle.service;

import com.example.springgradle.repository.EmployeeEntity;
import com.example.springgradle.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUsernameById(Long id) {
        EmployeeEntity employee = userRepository.getFirstById(id);
        return employee.getName();
    }
}
