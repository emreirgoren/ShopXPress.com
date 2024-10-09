package com.shopxpress_product_service.exception.handler;

import com.shopxpress_product_service.dto.response.GenericResponse;
import com.shopxpress_product_service.exception.ProductAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public GenericResponse handlerProductAlreadyExistException(ProductAlreadyExistException productAlreadyExistException){
        //return GenericResponse.failed();
        return null;
    }

}
