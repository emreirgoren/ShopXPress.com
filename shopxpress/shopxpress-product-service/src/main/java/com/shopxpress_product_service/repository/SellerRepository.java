package com.shopxpress_product_service.repository;

import com.shopxpress_product_service.model.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<Seller,String> {

    boolean existsByEmail(String email);
    Seller findByEmail(String email);
}
