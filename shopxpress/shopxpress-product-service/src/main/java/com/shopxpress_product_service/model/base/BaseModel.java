package com.shopxpress_product_service.model.base;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public abstract class BaseModel {

    @Id
    private String id;

    /**
     * Aktif true
     * Pasif false
     */
    @Field("is_active")
    private boolean isActive;

    @Field("created_at")
    @DateTimeFormat(pattern = "dd-MM-yyyy'T'HH-mm")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Field("updated_at")
    @DateTimeFormat(pattern = "dd-MM-yyyy'T'HH-mm")
    private LocalDateTime updatedAt;

}
