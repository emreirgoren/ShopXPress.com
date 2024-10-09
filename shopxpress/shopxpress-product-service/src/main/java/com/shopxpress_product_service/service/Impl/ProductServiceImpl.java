package com.shopxpress_product_service.service.Impl;

import com.shopxpress_product_service.converter.ProductConverter;
import com.shopxpress_product_service.dto.request.CreateProductRequest;
import com.shopxpress_product_service.dto.response.CreateProductResponse;
import com.shopxpress_product_service.dto.response.GenericResponse;
import com.shopxpress_product_service.model.Brand;
import com.shopxpress_product_service.model.Product;
import com.shopxpress_product_service.model.Seller;
import com.shopxpress_product_service.repository.ProductRepository;
import com.shopxpress_product_service.rules.ProductBusinessRules;
import com.shopxpress_product_service.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductBusinessRules productBusinessRules;

    public ProductServiceImpl(ProductRepository productRepository, ProductBusinessRules productBusinessRules) {
        this.productRepository = productRepository;
        this.productBusinessRules = productBusinessRules;
    }

    @Override
    public GenericResponse<CreateProductResponse> createProduct(String token, CreateProductRequest request) {

        Brand brand = productBusinessRules.checkBrandIsAvailable(request.getBrand());
        productBusinessRules.checkProductAlreadyExists(request.getName());
        Seller seller = productBusinessRules.checkSellerIsAvailable(request.getSeller());

        Product product = ProductConverter.CreateProductRequestToProduct(request,brand,seller);

        productRepository.save(product);

        return GenericResponse.success("Product Created", HttpStatus.CREATED,ProductConverter.ProductToCreateProductResponse(product));

    }

}
