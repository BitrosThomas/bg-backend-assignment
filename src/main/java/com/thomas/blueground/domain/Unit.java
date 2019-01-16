package com.thomas.blueground.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "UNIT")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    private Long id;

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

    @Column(name = "unit_score")
    private double score;

    @OneToMany(mappedBy = "unit", cascade = CascadeType.REMOVE, targetEntity = Review.class)
    private List<Review> reviews;

//    public Unit(String image, String title, String region, String description, String cancellation, double price, double score, List<Review> reviews) {
//        this.image = image;
//        this.title = title;
//        this.region = region;
//        this.description = description;
//        this.cancellation = cancellation;
//        this.price = price;
//        this.score = score;
//        this.reviews = reviews;
//    }
//
//    public Unit(Long id,String image, String title, String region, String description, String cancellation, double price, double score){
//        this.image = image;
//        this.title = title;
//        this.region = region;
//        this.description = description;
//        this.cancellation = cancellation;
//        this.price = price;
//        this.score = score;
//    }
//
//    public Unit() {
//
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
