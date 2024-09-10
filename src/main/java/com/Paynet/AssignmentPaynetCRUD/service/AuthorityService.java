package com.Paynet.AssignmentPaynetCRUD.service;

import com.Paynet.AssignmentPaynetCRUD.model.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;

public interface AuthorityService {
    public Collection<SimpleGrantedAuthority> getAuthorities(User user);
}
