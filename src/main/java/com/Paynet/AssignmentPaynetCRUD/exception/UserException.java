package com.Paynet.AssignmentPaynetCRUD.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private HttpStatus httpStatus;
	private String errorCode;
	private String errorMessage;
}
