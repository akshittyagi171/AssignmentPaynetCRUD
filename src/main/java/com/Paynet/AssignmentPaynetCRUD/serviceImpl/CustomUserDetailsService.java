package com.Paynet.AssignmentPaynetCRUD.serviceImpl;

import com.Paynet.AssignmentPaynetCRUD.model.User;
import com.Paynet.AssignmentPaynetCRUD.model.User.Role;
import com.Paynet.AssignmentPaynetCRUD.repository.UserRepository;

import com.Paynet.AssignmentPaynetCRUD.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityService authorityService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                authorityService.getAuthorities(user));
    }
}

