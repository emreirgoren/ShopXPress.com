package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import com.shopxpress_product_service.model.constant.ModelConstants;
import com.shopxpress_product_service.model.constant.ProductModelConstants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Document(collection = "products")
@Entity
public class Product extends BaseModel {

    @NotBlank(message = "Product name cannot be empty")
    @Field(ModelConstants.NAME)
    private String name;

    @Field(ModelConstants.DESCRIPTION)
    private String description;

    @Min(value = 0, message = "Price should not be less than 0")
    @Field(ProductModelConstants.PRICE)
    private double price;

    @Field(ProductModelConstants.IMAGES)
    private List<byte[]> imageList;

    @Field(ProductModelConstants.STOCK_QUANTITY)
    private int stockQuantity;

    @DBRef
    @Field(ProductModelConstants.BRAND)
    private Brand brand;

    @DBRef
    @Field(ProductModelConstants.CATEGORIES)
    private List<Category> categories;

    @DBRef
    @Field(ProductModelConstants.SELLER)
    private Seller seller;

    @DBRef
    @Field(ProductModelConstants.RATINGS)
    private List<Rating> ratings;

}
