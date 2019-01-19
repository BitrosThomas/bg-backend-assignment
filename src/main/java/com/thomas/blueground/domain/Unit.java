package com.thomas.blueground.domain;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UNIT")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    private Long unitID;

    @Column(name = "unit_image")
    private String image;

    @Column(name = "unit_title")
    private String title;

    @Column(name = "unit_region")
    private String region;

    @Column(name = "unit_description")
    private String description;

    @Column(name = "unit_cancellation")
    private String cancellation;

    @Column(name = "unit_price")
    private double price;

    @OneToMany(mappedBy = "unit", cascade = {CascadeType.REMOVE,CascadeType.MERGE, CascadeType.REFRESH}, orphanRemoval = true, targetEntity = Review.class)
    private List<Review> reviews;

    @Column(name = "unit_score")
//    @Formula(value = "SELECT AVERAGE(score) FROM REVIEWS" +
//            "WHERE unit_id ={id}" +
//            "=> UPDATE TABLE UNITS values('0.1' WHERE unit_id = {unit_id}")
    private double score;

    public Long getUnitID() {
        return unitID;
    }

    public void setUnitID(Long unitID) {
        this.unitID = unitID;
    }

    public String getImage() {
        return image;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
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
}
