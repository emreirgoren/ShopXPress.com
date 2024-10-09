package com.shopxpress_product_service.rules;

import com.shopxpress_product_service.converter.ProductConverter;
import com.shopxpress_product_service.exception.BrandAlreadyExistsException;
import com.shopxpress_product_service.exception.ProductAlreadyExistException;
import com.shopxpress_product_service.model.Brand;
import com.shopxpress_product_service.model.Seller;
import com.shopxpress_product_service.repository.BrandRepository;
import com.shopxpress_product_service.repository.ProductRepository;
import com.shopxpress_product_service.repository.SellerRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductBusinessRules {

    private final BrandRepository brandRepository;
    private final ProductRepository productRepository;
    private final SellerRepository sellerRepository;
    public ProductBusinessRules(BrandRepository brandRepository, ProductRepository productRepository, SellerRepository sellerRepository) {
        this.brandRepository = brandRepository;
        this.productRepository = productRepository;
        this.sellerRepository = sellerRepository;
    }

    public Brand checkBrandIsAvailable(Brand brand) {

        if (brandRepository.existsByName(brand.getName())) {
            throw new BrandAlreadyExistsException("Brand Already Exists");
        }

        brandRepository.save(brand);

        return brandRepository.findByName(brand.getName());
    }

    public void checkProductAlreadyExists(String name) {

        if (productRepository.existsByName(name)){
            throw new ProductAlreadyExistException("Product Already Exists");
        }

    }

    public Seller checkSellerIsAvailable(Seller seller) {

        if (sellerRepository.existsByEmail(seller.getEmail())){
            Seller findSeller = sellerRepository.findByEmail(seller.getEmail());
            return seller;
        }

        Seller newSeller = ProductConverter.CreateProductRequestToSeller(seller);
        sellerRepository.save(newSeller);
        return sellerRepository.findByEmail(newSeller.getEmail());
    }

}
