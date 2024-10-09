package com.shopxpress_product_service.repository;

import com.shopxpress_product_service.model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends MongoRepository<Brand,String> {

    boolean existsByName(String name);

    Brand findByName(String name);

}
