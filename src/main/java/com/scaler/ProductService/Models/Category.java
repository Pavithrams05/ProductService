package com.scaler.ProductService.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity(name = "categories")
public class Category extends BaseModel{

    private String value;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
