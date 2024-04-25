package com.proj2.q1;

public class ErrorResponse {
    private String error;
    private String message;

    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    // Getter for 'error'
    public String getError() {
        return error;
    }

    // Setter for 'error'
    public void setError(String error) {
        this.error = error;
    }

    // Getter for 'message'
    public String getMessage() {
        return message;
    }

    // Setter for 'message'
    public void setMessage(String message) {
        this.message = message;
    }
}

