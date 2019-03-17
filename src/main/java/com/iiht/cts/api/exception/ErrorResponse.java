/**
 * 
 */
package com.iiht.cts.api.exception;

import java.util.Date;

/**
 * Error Response Class to store Error Details
 * 
 * @author Mohamed Yusuff
 */
public class ErrorResponse {

	private Integer errorCode;
	private String errorStatus;
	private String errorMessage;
	private String errorPath;
	private Date errorOccurredTime;
	
	/**
	 * Argument Constructor to Instantiate with Error details
	 * 
	 * @param errorCode
	 * @param errorStatus
	 * @param errorMessage
	 * @param errorPath
	 * @param errorOccurredTime
	 */
	public ErrorResponse(Integer errorCode, String errorStatus, String errorMessage, String errorPath,
			Date errorOccurredTime) {
		super();
		this.errorCode = errorCode;
		this.errorStatus = errorStatus;
		this.errorMessage = errorMessage;
		this.errorPath = errorPath;
		this.errorOccurredTime = errorOccurredTime;
	}
	
	/**
	 * @return
	 */
	public Integer getErrorCode() {
		return errorCode;
	}

	/**
	 * @return
	 */
	public String getErrorStatus() {
		return errorStatus;
	}

	/**
	 * @return
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return
	 */
	public String getErrorPath() {
		return errorPath;
	}
	
	/**
	 * @return
	 */
	public Date getErrorOccurredTime() {
		return errorOccurredTime != null ? (Date) errorOccurredTime.clone() : null;
	}
}
