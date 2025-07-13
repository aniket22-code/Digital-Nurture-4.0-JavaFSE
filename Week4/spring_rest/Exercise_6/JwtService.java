package com.cognizant.service;

import com.cognizant.model.*;
import com.cognizant.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    public String generateToken(AuthRequest authRequest) throws Exception {
        try {
            // Authenticate user credentials
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    authRequest.getUsername(), 
                    authRequest.getPassword()
                )
            );
        } catch (AuthenticationException ex) {
            throw new Exception("Invalid username or password");
        }

        // Generate token using JwtUtil
        return jwtUtil.generateToken(authRequest.getUsername());
    }
}
