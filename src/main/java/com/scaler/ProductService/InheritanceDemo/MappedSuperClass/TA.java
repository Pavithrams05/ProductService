package com.scaler.ProductService.InheritanceDemo.MappedSuperClass;

import com.scaler.ProductService.Models.Product;
import jakarta.persistence.Entity;

@Entity(name = "msc_ta")
public class TA extends User {
    private int noOfSessions;

    public int getNoOfSessions() {
        return noOfSessions;
    }
    public void setNoOfSessions(int noOfSessions) {
        this.noOfSessions = noOfSessions;
    }

}
