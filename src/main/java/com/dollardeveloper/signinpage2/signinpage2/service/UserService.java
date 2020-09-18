package com.dollardeveloper.signinpage2.signinpage2.service;

import com.dollardeveloper.signinpage2.signinpage2.web.dto.UserRegistrationDto;
import com.dollardeveloper.signinpage2.signinpage2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {


    User save(UserRegistrationDto registrationDto);
}
