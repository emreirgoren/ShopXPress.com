package com.shopxpress_product_service.service;


import com.shopxpress_product_service.dto.request.CreateProductRequest;
import com.shopxpress_product_service.dto.response.CreateProductResponse;
import com.shopxpress_product_service.dto.response.GenericResponse;

public interface ProductService {

    GenericResponse<CreateProductResponse> createProduct(String token, CreateProductRequest request);

}
