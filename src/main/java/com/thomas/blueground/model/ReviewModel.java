package com.thomas.blueground.model;

import com.thomas.blueground.domain.Unit;

public class ReviewModel {

    private double score;
    private String comment;
    private Unit unit;
    private Long unit_id;

    public Long getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(Long unit_id) {
        this.unit_id = unit_id;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
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
