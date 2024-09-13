package com.shopxpress_product_service.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Document(collection = "ratings")
public class Rating {

    @Id
    private String id;

    @Field("user_id")
    private String userId;

    @Field("product_id")
    private String productId;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating must be at most 5")
    @Field("rating_value")
    private int ratingValue;

    @Field("comment")
    private String comment;

    @Field("created_at")
    private String createdAt;


}
