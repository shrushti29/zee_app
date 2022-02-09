package com.zee.zee5_app.exception.apierror;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)//it wont call super.hashcode or super.equals
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {
private String object;
private String field;
private Object rejectedValue;
private String message;
public ApiValidationError(String object,String message)
{
	
}
}
