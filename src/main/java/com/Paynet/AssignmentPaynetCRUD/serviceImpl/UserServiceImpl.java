package com.Paynet.AssignmentPaynetCRUD.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Paynet.AssignmentPaynetCRUD.dao.UserDAO;
import com.Paynet.AssignmentPaynetCRUD.dto.UserDTO;
import com.Paynet.AssignmentPaynetCRUD.model.User;
import com.Paynet.AssignmentPaynetCRUD.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User addUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setAge(userDTO.getAge());
        user.setAddress(userDTO.getAddress());
        user.setEmailAddress(userDTO.getEmailAddress());
        user.setStatus(userDTO.getStatus());
        return userDAO.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User updateUser(Long id, UserDTO userDTO) {
        User user = userDAO.getUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDTO.getName());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setAge(userDTO.getAge());
        user.setAddress(userDTO.getAddress());
        user.setEmailAddress(userDTO.getEmailAddress());
        user.setStatus(userDTO.getStatus());
        return userDAO.saveUser(user);
    }
}
