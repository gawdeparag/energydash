package com.energydash.energydash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energydash.energydash.entity.Users;
import com.energydash.energydash.repository.UsersRepository;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Users getUserById(Long userId) {
        return usersRepository.findById(userId).orElse(null);
    }

    // Other methods for user-related operations
}