package dev.jwtdemo.service;

import dev.jwtdemo.dto.request.SignInRequest;
import dev.jwtdemo.dto.request.SignUpRequest;
import dev.jwtdemo.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {

    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SignInRequest request);
}
