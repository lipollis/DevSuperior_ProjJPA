package com.example.devsuperior_projjpa.repositories;

import com.example.devsuperior_projjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
