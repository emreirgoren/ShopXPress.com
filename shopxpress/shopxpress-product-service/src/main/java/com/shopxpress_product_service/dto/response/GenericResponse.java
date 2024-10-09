package com.shopxpress_product_service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GenericResponse<T> implements Serializable {

    private String message;
    private String status;
    private HttpStatus httpStatus;
    private T data;

    public static <T> GenericResponse<T> success(String message,
                                                 HttpStatus httpStatus,
                                                 T data){
        return GenericResponse.<T>builder()
                .message(message)
                .status(GenericResponseConstants.SUCCESS)
                .httpStatus(httpStatus)
                .data(data)
                .build();
    }

    public static <T> GenericResponse<T> failed(String message,
                                                HttpStatus httpStatus){
        return GenericResponse.<T>builder()
                .message(message)
                .status(GenericResponseConstants.FAILED)
                .httpStatus(httpStatus)
                .data(null)
                .build();
    }

}
