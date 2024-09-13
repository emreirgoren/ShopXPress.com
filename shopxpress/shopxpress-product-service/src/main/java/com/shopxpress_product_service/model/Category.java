package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "categories")
public class Category extends BaseModel {

    @Field("name")
    private String name;

    @Field("description")
    private String description;

}
