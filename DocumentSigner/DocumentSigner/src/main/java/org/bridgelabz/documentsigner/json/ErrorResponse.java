// POJO Class for returning the various error responses
// encountered in the various modules

package org.bridgelabz.documentsigner.json;

public class ErrorResponse extends Response {

	private String errorMessage;
	private String displayMessage;

	// Setter and Getter methods

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

}