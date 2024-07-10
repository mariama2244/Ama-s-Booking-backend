package com.doranco.amasbooking.model.service;

import com.doranco.amasbooking.repository.UserRepository;

public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;




    }


}
