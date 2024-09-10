package com.Paynet.AssignmentPaynetCRUD.serviceImpl;

import com.Paynet.AssignmentPaynetCRUD.service.PasswordEncoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptPasswordEncoderServiceImpl implements PasswordEncoderService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public String encode(String password) {
        return passwordEncoder.encode(password);
    }
}
