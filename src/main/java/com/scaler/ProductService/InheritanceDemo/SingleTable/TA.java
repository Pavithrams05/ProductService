package com.scaler.ProductService.InheritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class TA extends User {
    private int noOfSessions;

    public int getNoOfSessions() {
        return noOfSessions;
    }
    public void setNoOfSessions(int noOfSessions) {
        this.noOfSessions = noOfSessions;
    }

}
