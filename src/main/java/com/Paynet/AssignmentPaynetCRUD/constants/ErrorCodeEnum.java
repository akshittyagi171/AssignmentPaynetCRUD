package com.Paynet.AssignmentPaynetCRUD.constants;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {
	GENERIC_EXCEPTION("10001","Something went wrong, please try later");
	
	
	private final String errorCode;
	private final String errorMessage;
	
	private ErrorCodeEnum(String errorCode, String errorMessage) {
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}
	
}
