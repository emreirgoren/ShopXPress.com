package com.shopxpress_product_service.exception;

public class BrandAlreadyExistsException extends RuntimeException {

    public BrandAlreadyExistsException(String message) {
        super(message);
    }
}
