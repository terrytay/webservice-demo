package com.terry.webservice.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.terry.webservice.demo.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
