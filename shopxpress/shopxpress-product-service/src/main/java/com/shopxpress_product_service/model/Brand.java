package com.shopxpress_product_service.model;

import com.shopxpress_product_service.model.base.BaseModel;
import com.shopxpress_product_service.model.constant.BrandModelConstants;
import com.shopxpress_product_service.model.constant.ModelConstants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Document(collection = "brands")
public class Brand extends BaseModel {

    @NotBlank(message = "Brand name is required")
    @Field(ModelConstants.NAME)
    private String name;

    @Field(ModelConstants.DESCRIPTION)
    private String description;

    @Field(BrandModelConstants.LOGO)
    private byte[] logo;

}
