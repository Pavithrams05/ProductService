package com.scaler.ProductService.Services;

import com.scaler.ProductService.Exceptions.ProductNotFoundException;
import com.scaler.ProductService.Models.Product;
import com.scaler.ProductService.Repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService") //defining the name of the bean while creating
//@Primary //annotation that injects to create an object of the class when there are more than 1 bean.
// i.e when 2 classes implement the same interface it shows which class object as to be created.

public class SelfProductService implements ProductService{

    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);
        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product with id: " + productId + "not found");
        }
        return productOptional.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }
}
