package com.scaler.ProductService.InheritanceDemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tpc_ta")
public class TA extends User {
    private int noOfSessions;

    public int getNoOfSessions() {
        return noOfSessions;
    }
    public void setNoOfSessions(int noOfSessions) {
        this.noOfSessions = noOfSessions;
    }

}
