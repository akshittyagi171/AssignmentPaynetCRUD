package com.Paynet.AssignmentPaynetCRUD.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserError {
	private String errorCode;
	private String errorMessage;
}
