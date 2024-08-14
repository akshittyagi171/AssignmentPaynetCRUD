package com.Paynet.AssignmentPaynetCRUD.dto;

import com.Paynet.AssignmentPaynetCRUD.model.User;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String phoneNumber;
    private Integer age;
    private String address;
    private String emailAddress;
    private User.Status status;
}

