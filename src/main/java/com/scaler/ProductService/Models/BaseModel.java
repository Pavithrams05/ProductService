package com.scaler.ProductService.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseModel {

    private long id;
    private long createdAt;
    private long lastUpdateAt;
}
