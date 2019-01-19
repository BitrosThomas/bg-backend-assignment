package com.thomas.blueground.mappers;

import com.thomas.blueground.domain.Review;
import com.thomas.blueground.model.ReviewModel;
import org.springframework.stereotype.Component;

@Component
public class ReviewToReviewModelMapper {

    public ReviewModel mapToReviewModel(Review review) {
        ReviewModel reviewModel = new ReviewModel();
        reviewModel.setScore(review.getScore());
        reviewModel.setUnit_id(review.getUnit().getUnitID());
        reviewModel.setComment(review.getComment());
        return reviewModel;
    }
}
