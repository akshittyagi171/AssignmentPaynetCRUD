package com.Paynet.AssignmentPaynetCRUD.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserException {
	private HttpStatus httpStatus;
	private String errorCode;
	private String errorMessage;
}
