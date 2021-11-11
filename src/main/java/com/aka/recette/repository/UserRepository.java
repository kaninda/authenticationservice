package com.aka.recette.repository;

import com.aka.recette.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String Email);
    User findByName (String name);
}
