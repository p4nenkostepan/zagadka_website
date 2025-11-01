package com.secret.springApp.Repo;

import com.secret.springApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository
{
    Optional<User> findById(Long id);
}
