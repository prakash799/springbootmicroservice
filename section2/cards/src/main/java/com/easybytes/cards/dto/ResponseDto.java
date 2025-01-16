package com.easybytes.cards.dto;

public class ResponseDto {

    private String statusCode;

    private String StatusMessage;

    public ResponseDto() {
    }

    public ResponseDto(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        StatusMessage = statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        StatusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "statusCode='" + statusCode + '\'' +
                ", StatusMessage='" + StatusMessage + '\'' +
                '}';
    }
}
