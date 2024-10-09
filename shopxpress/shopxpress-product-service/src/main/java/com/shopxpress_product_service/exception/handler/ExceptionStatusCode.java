package com.shopxpress_product_service.exception.handler;

import lombok.Getter;

@Getter
public enum ExceptionStatusCode {

    PRODUCT_ALREADY_EXIST(600,"Product already exist");

    private int statusCode;
    private String statusMessage;

    ExceptionStatusCode(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
}
