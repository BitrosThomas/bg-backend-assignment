package com.thomas.blueground.model;

import com.thomas.blueground.domain.Unit;

import javax.validation.constraints.NotNull;

public class ReviewModel {

    @NotNull( message = "Please enter a Score for the review!")
    private double score;
    
    private String comment;
    private Long unit_id;
    private Long applicationUser_id;

    public Long getApplicationUser_id() {
        return applicationUser_id;
    }

    public void setApplicationUser_id(Long applicationUser_id) {
        this.applicationUser_id = applicationUser_id;
    }

    public Long getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(Long unit_id) {
        this.unit_id = unit_id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
