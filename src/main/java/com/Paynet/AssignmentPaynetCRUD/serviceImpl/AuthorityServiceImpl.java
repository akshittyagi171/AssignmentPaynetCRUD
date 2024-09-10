package com.Paynet.AssignmentPaynetCRUD.serviceImpl;

import com.Paynet.AssignmentPaynetCRUD.model.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class AuthorityServiceImpl {
    public Collection<SimpleGrantedAuthority> getAuthorities(User user) {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));
    }
}
