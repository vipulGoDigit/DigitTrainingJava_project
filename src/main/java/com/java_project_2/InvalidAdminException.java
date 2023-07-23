/**
 * 
 */
package com.java_project_2;

/**
 * 
 */

@SuppressWarnings("serial")
public class InvalidAdminException extends Exception {

	public String getMessage() {
		return "Invalid Credentials. You are not authenticated!";
	}
}
