package com.Paynet.AssignmentPaynetCRUD.service;

import java.util.List;

import com.Paynet.AssignmentPaynetCRUD.dto.UserDTO;
import com.Paynet.AssignmentPaynetCRUD.model.User;

public interface UserService {
    User addUser(UserDTO userDTO);
    List<User> getAllUsers();
    User getUserById(Long id);
    void deleteUser(Long id);
    User updateUser(Long id, UserDTO userDTO);
}