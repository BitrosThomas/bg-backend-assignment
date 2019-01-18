package com.thomas.blueground.model;

public class UnitModel {
    private Long unitID;
    private String image;
    private String title;
    private String region;
    private String description;
    private String cancellation;
    private double price;
    private double score;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Long getUnitID() {
        return unitID;
    }

    public void setUnitID(Long unitID) {
        this.unitID = unitID;
    }

    public UnitModel(Long unitID,String image, String title, String region, String description, String cancellation, double price, double score){
        this.unitID = unitID;
        this.image = image;
        this.title = title;
        this.region = region;
        this.description = description;
        this.cancellation = cancellation;
        this.price = price;
        this.score = score;
    }
}
