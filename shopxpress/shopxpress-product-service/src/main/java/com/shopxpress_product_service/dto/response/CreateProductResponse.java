package com.shopxpress_product_service.dto.response;

import com.shopxpress_product_service.model.Brand;
import com.shopxpress_product_service.model.Category;
import com.shopxpress_product_service.model.Seller;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateProductResponse {

    private String name;

    private String description;

    private double price;

    private byte[] image;

    private int stockQuantity;

    private Brand brand;

    private List<Category> categoryList;

    private Seller seller;

}
