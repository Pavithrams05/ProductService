package com.scaler.ProductService.InheritanceDemo.SingleTable;

public class Instructor extends User {
    private String specialization;
    private double avgRating;

    public String getSpecialization() {
            return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getAvgRating() {
        return avgRating;
    }
    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }
}
