package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import com.shopxpress_product_service.model.constant.ModelConstants;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "categories")
public class Category extends BaseModel {

    @Field(ModelConstants.NAME)
    private String name;

    @Field(ModelConstants.DESCRIPTION)
    private String description;

}
