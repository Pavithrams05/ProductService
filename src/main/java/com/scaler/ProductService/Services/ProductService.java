package com.scaler.ProductService.Services;

import com.scaler.ProductService.Exceptions.ProductNotFoundException;
import com.scaler.ProductService.Models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(Long productId);

    Product updateProduct(Long productId, Product product);

    Product replaceProduct(Long productId, Product product);


}
