package com.shopxpress_product_service.converter;

import com.shopxpress_product_service.dto.request.CreateProductRequest;
import com.shopxpress_product_service.dto.response.CreateProductResponse;
import com.shopxpress_product_service.model.Brand;
import com.shopxpress_product_service.model.Product;
import com.shopxpress_product_service.model.Rating;
import com.shopxpress_product_service.model.Seller;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductConverter {


    public static CreateProductResponse CreateProductRequestToCreateProductResponse(CreateProductRequest request){

        if (request == null){
            throw new IllegalArgumentException("CreateProductRequest cannot be null");
        }
        CreateProductResponse response = new CreateProductResponse();
        response.setName(request.getName());
        response.setDescription(request.getDescription());
        response.setPrice(request.getPrice());
        response.getImageList().add(request.getImage());
        response.setStockQuantity(request.getStockQuantity());
        response.setBrand(request.getBrand());
        //response.getCategoryList().add(request.getCategory());

        response.setSeller(request.getSeller());

        return response;
    }

    public static Product CreateProductRequestToProduct(CreateProductRequest request, Brand brand,Seller seller){
        if( request == null ){
            throw new IllegalArgumentException("CreateProductRequest cannot be null");
        }
        Product product = new Product();

        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());

        if(request.getImage() != null ){
            product.getImageList().add(request.getImage());
        }

        product.setStockQuantity(request.getStockQuantity());
        product.setBrand(brand);

        if (request.getCategoryList() != null){
            product.setCategories(request.getCategoryList());
        }

        product.setSeller(seller);
        List<Rating> ratings = new ArrayList<>();
        product.setRatings(ratings);

        return product;
    }

    public static Brand CreateProductRequestToBrand(CreateProductRequest request){
        if(request == null){
            throw new IllegalArgumentException("CreateProductRequest cannot be null");
        }

        Brand brand = new Brand();
        brand.setName(request.getBrand().getName());
        brand.setDescription(request.getBrand().getDescription());
        brand.setLogo(request.getBrand().getLogo());
        return brand;
    }

    public static Seller CreateProductRequestToSeller(Seller seller) {

        if(seller == null){
            throw new IllegalArgumentException("Seller cannot be null");
        }
        Seller newSeller = new Seller();
        newSeller.setName(seller.getName());
        newSeller.setEmail(seller.getEmail());
        newSeller.setPhoneNumber(seller.getPhoneNumber());
        newSeller.setAddress(seller.getAddress());
        newSeller.setRating(seller.getRating());
        return newSeller;
    }

    public static CreateProductResponse ProductToCreateProductResponse(Product product) {

        if(product == null){
            throw new IllegalArgumentException("Product cannot be null");
        }

        CreateProductResponse createProductResponse = new CreateProductResponse();
        createProductResponse.setName(product.getName());
        createProductResponse.setDescription(product.getDescription());
        createProductResponse.setPrice(product.getPrice());
        createProductResponse.setImage(product.getImageList().get(0));
        createProductResponse.setStockQuantity(product.getStockQuantity());
        createProductResponse.setBrand(product.getBrand());
        createProductResponse.setCategoryList(product.getCategories());
        createProductResponse.setSeller(product.getSeller());

        return createProductResponse;
    }
}
