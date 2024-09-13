package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Document(collection = "brands")
public class Brand extends BaseModel {

    @NotBlank(message = "Brand name is required")
    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("logo")
    private byte[] logoUrl;

}
