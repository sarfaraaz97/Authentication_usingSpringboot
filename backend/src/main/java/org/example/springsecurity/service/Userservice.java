package org.example.springsecurity.service;

import org.example.springsecurity.model.User;
import org.example.springsecurity.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);
    @Autowired
    private Userrepo repo;
    public User savUser(User user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return repo.save(user);
    }
}
