package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Document(collection = "products")
@Entity
public class Product extends BaseModel {

    @NotBlank(message = "Product name cannot be empty")
    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Min(value = 0, message = "Price should not be less than 0")
    @Field("price")
    private double price;

    @Field("images")
    private List<byte[]> imageList;

    @Field("stock_quantity")
    private int stockQuantity;

    @DBRef
    @Field("brand")
    private Brand brand;

    @DBRef
    @Field("categories")
    private List<Category> categories;

    @DBRef
    @Field("seller")
    private Seller seller;

    @DBRef
    @Field("ratings")
    private List<Rating> ratings;

}
