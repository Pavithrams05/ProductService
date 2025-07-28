package com.scaler.ProductService.Controllers;

import com.scaler.ProductService.Exceptions.ProductNotFoundException;
import com.scaler.ProductService.Models.Product;
import com.scaler.ProductService.Services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
class ProductControllerTest {

    @Autowired // this annotation is coming from spring boot so to call this we need Springboottest annotation
    ProductController productController;

    @MockitoBean // annotation used to mock the productservice in unit testing when the method to be called for the
    ProductService productService;

    @Test
    void getSingleProduct() throws ProductNotFoundException {

        //Arrange
        Product expectedOutut = new Product();
        expectedOutut.setId(10L);
        expectedOutut.setTitle("iphone");
        expectedOutut.setPrice(10000.0);
        expectedOutut.setDescription("Apple");
        when(productService.getSingleProduct(10L)).thenReturn(expectedOutut);

        //Act
        Product actualProduct =  productController.getSingleProduct(10L);

        //Assert

        assertEquals(expectedOutut, actualProduct);




    }

    @Test
    void getAllProducts() {
    }

    @Test
    void createProduct() {
    }

    @Test
    void deleteProdct() {
    }

    @Test
    void updateProduct() {
    }

    @Test
    void replaceProduct() {
    }
}