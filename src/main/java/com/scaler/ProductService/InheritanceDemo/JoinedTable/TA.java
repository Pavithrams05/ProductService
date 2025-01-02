package com.scaler.ProductService.InheritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_ta")
//@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {
    private int noOfSessions;

    public int getNoOfSessions() {
        return noOfSessions;
    }
    public void setNoOfSessions(int noOfSessions) {
        this.noOfSessions = noOfSessions;
    }

}
