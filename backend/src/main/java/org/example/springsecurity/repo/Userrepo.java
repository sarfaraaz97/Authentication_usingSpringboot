package org.example.springsecurity.repo;

import org.example.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
