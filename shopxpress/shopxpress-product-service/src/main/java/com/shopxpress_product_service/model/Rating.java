package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.constant.RatingModelConstants;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Document(collection = "ratings")
public class Rating {

    @Id
    private String id;

    @Field(RatingModelConstants.USER_ID)
    private String userId;

    @Field(RatingModelConstants.PRODUCT_ID)
    private String productId;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating must be at most 5")
    @Field(RatingModelConstants.RATING_VALUE)
    private int ratingValue;

    @Field(RatingModelConstants.COMMENT)
    private String comment;

    @Field(RatingModelConstants.CREATED_AT)
    private String createdAt;


}
