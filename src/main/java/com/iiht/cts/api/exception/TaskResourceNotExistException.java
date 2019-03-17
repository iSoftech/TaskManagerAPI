/**
 * 
 */
package com.iiht.cts.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Task Resource Not Exist Runtime Exception Class
 * 
 * @author Mohamed Yusuff
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class TaskResourceNotExistException extends RuntimeException {
	
	/**
	 * Auto Generated Serial Version UID
	 */
	private static final long serialVersionUID = -7206259820819733712L;

	/**
	 * Parameterised Constructor to store Exception Message
	 * 
	 * @param exceptionMessage
	 */
	public TaskResourceNotExistException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
