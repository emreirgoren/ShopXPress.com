package com.shopxpress_product_service.exception;

public class ProductAlreadyExistException extends RuntimeException{

    public ProductAlreadyExistException(String message) {
        super(message);
    }

}
