package com.scaler.ProductService.InheritanceDemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "msc_mentor")
public class Mentor extends User{
    private String company;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
