package com.Paynet.AssignmentPaynetCRUD.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Paynet.AssignmentPaynetCRUD.constants.ErrorCodeEnum;
import com.Paynet.AssignmentPaynetCRUD.pojo.UserError;

@ControllerAdvice
public class UserExceptionHandler extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@ExceptionHandler(UserExceptionHandler.class)
	public ResponseEntity<UserError> handleValidationException(UserException ex) {
		UserError response = UserError.builder().errorCode(ex.getErrorCode())
				.errorMessage(ex.getErrorMessage()).build();
		return new ResponseEntity<>(response, ex.getHttpStatus());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<UserError> handleGenericException(Exception ex) {
		UserError paymentResponse = UserError.builder()
				.errorCode(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorCode())
				.errorMessage(ErrorCodeEnum.GENERIC_EXCEPTION.getErrorMessage())
				.build();
		return new ResponseEntity<>(paymentResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
