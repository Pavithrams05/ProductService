package com.scaler.ProductService.Exceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(long productId, String message){

        super(message+" id= "+productId);
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}
