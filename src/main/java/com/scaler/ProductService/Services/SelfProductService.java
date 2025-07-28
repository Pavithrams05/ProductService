package com.scaler.ProductService.Services;

import com.scaler.ProductService.Exceptions.ProductNotFoundException;
import com.scaler.ProductService.Models.Category;
import com.scaler.ProductService.Models.Product;
import com.scaler.ProductService.Repositories.CategoryRepository;
import com.scaler.ProductService.Repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService") //defining the name of the bean while creating
@Primary //annotation that injects to create an object of the class when there are more than 1 bean.
// i.e when 2 classes implement the same interface it shows which class object as to be created.

public class SelfProductService implements ProductService{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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
        return productRepository.findAll();

    }

    @Override
    public Product createProduct(Product product) {
        if(product.getCategory() != null){
            if(product.getCategory().getId() == null){
                //create a category first
                Category category = product.getCategory();
                Optional<Category> categoryfromDB = categoryRepository.findByValue(category.getValue());
                if (categoryfromDB.isEmpty()){
                    category = categoryRepository.save(category);
                    product.setCategory(category);
                }else{
                    product.setCategory(categoryfromDB.get());
                }

            }
        }else{
            throw new RuntimeException("category cannot be null while creating product");
        }
        return productRepository.save(product);
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
