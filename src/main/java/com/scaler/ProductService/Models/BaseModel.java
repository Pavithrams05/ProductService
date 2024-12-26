package com.scaler.ProductService.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id //primarykey of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement the primarykey value
    private Long id;
    private Long createdAt;
    private Long lastUpdateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getLastUpdateAt() {
        return lastUpdateAt;
    }
    public void setLastUpdateAt(Long lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }
}
