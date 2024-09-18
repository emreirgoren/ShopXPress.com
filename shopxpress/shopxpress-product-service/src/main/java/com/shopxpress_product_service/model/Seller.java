package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.constant.ModelConstants;
import com.shopxpress_product_service.model.constant.SellerModelConstant;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Document(collection = "sellers")
public class Seller {

    @Id
    private Long sellerId;

    @NotBlank(message = "Seller name is required")
    @Field(ModelConstants.NAME)
    private String name;

    @Field(SellerModelConstant.EMAIL)
    private String email;

    @Field(SellerModelConstant.PHONE_NUMBER)
    private String phoneNumber;

    @Field(SellerModelConstant.ADDRESS)
    private String address;

    @Field(SellerModelConstant.RATING)
    private Rating rating;

}
