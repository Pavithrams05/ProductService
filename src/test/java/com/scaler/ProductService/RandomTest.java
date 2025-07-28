package com.scaler.ProductService;

import com.scaler.ProductService.Exceptions.ProductNotFoundException;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTest {

    @Test
    public void testAdd(){
        //3+5=8;
        //3A -> arrange, act,assert

        int a = 3;
        int b = 5;
        int actualOutput =a + b;

        assertEquals(8, actualOutput, "Test case Failed");

        //some of assert statements
//        assertNull(new Object(), "Test case Failed");
//        assertNotNull(a, "Test case Failed");
//        assertTimeout(Duration.ofMillis(100), () -> productRepo.findById()); //chceking duration of excecution

        // checking wheather the exception thrown with invalid id
//        assertThrows(ProductNotFoundException.class, ()->productController.getProductById(10));

    }
}
