package com.energydash.energydash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.energydash.energydash.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // Custom query methods can be added here if needed
}