package com.example.opticstore.service;

import com.example.opticstore.model.User;
import com.example.opticstore.web.dto.UserRegistrarionDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrarionDto userRegistrarionDto);
}
