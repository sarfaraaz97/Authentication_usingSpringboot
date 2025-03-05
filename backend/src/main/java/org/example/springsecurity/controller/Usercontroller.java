package org.example.springsecurity.controller;

import org.example.springsecurity.model.User;
import org.example.springsecurity.service.JwtService;
import org.example.springsecurity.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @Autowired
    private Userservice userservice;
    @Autowired
    private JwtService jwtService;
    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("register")
    public User register(@RequestBody User user)
    {
        return userservice.savUser(user);
    }
    @PostMapping("login")
    public String login(@RequestBody User user)
    {
        Authentication authentication=authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        if(authentication.isAuthenticated())
        {
            return jwtService.generateToken(user.getUsername());
        }else{
            return "Invalid username or password";
        }
    }
}
