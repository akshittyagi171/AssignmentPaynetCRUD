package com.Paynet.AssignmentPaynetCRUD.model;

import lombok.Getter;

@Getter
public class JwtResponse {
    private final String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

}
