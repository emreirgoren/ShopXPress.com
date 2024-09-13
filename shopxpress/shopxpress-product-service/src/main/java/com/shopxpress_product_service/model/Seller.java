package com.shopxpress_product_service.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Document(collection = "sellers")
public class Seller {

    @Id
    private Long sellerId;

    @NotBlank(message = "Seller name is required")
    @Field("name")
    private String name;

    @Field("email")
    private String email;

    @Field("phone_number")
    private String phoneNumber;

    @Field("address")
    private String address;

    @Field("rating")
    private Rating rating;

}
