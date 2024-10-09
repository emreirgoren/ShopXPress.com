package com.shopxpress_product_service.controller;

import com.shopxpress_product_service.dto.request.CreateProductRequest;
import com.shopxpress_product_service.dto.response.CreateProductResponse;
import com.shopxpress_product_service.dto.response.GenericResponse;
import com.shopxpress_product_service.service.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public GenericResponse<CreateProductResponse> createProduct(@RequestHeader("Authorization") String token, @RequestBody CreateProductRequest request){
        return productService.createProduct(token,request);
    }

}
