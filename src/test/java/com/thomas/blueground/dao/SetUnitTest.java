package com.thomas.blueground.dao;

import com.thomas.blueground.domain.Unit;
import com.thomas.blueground.mappers.UnitToUnitModelMapper;
import com.thomas.blueground.model.ReviewModel;
import com.thomas.blueground.model.UnitModel;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SetUnitTest {

//    @org.junit.jupiter.api.Test
//    void setUnitTest() {
//
//        UnitModel unitModel = new UnitModel();
//        Unit unitModelTest = UnitToUnitModelMapper.mapToUnitModel(testUnit());
//
//
//        assertTrue(unitModelTest.getImage().equals("imageurl1"));
//        assertTrue(unitModelTest.getTitle().equals("Moon"));
//        assertTrue(unitModelTest.getRegion().equals("Darkside"));
//        assertTrue(unitModelTest.getDescription().equals("it's very warm"));
//        assertTrue(unitModelTest.getCancellation().equals("10 days refund policy"));
//        assertTrue(unitModelTest.getPrice() == 1000.0);
//
//
//        assertFalse(unitModelTest.getImage().equals("1231231"));
//        assertFalse(unitModelTest.getPrice() == 1000.0);
//    }

    private Unit testUnit() {
        Unit unitTest = new Unit();
        unitTest.setImage("image");
        unitTest.setTitle("title");
        unitTest.setRegion("region");
        unitTest.setDescription("description");
        unitTest.setCancellation("cancel");
        unitTest.setPrice(1000.0);
        return unitTest;

        }


}


//    public ReviewModel mapToReviewModel(Review review) {
//        ReviewModel reviewModel = new ReviewModel();
//        reviewModel.setScore(review.getScore());
//        reviewModel.setUnit_id(review.getUnit().getUnitID());
//        reviewModel.setApplicationUser_id(review.getApplicationUser().getId());
//        reviewModel.setComment(review.getComment());
//        return reviewModel;
//    }