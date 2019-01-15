package com.thomas.blueground.service;

import com.thomas.blueground.domain.Review;
import com.thomas.blueground.mappers.ReviewToReviewModelMapper;
import com.thomas.blueground.model.ReviewModel;
import com.thomas.blueground.repository.ReviewJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewJPARepository jpaRepository;

    @Autowired
    private ReviewToReviewModelMapper reviewMapper;

    @Override
    public ReviewModel create(ReviewModel reviewModel) {
        Review review = new Review(reviewModel.getScore(), reviewModel.getComment());
        Review savedReview = jpaRepository.save(review);
        return reviewMapper.mapToReviewModel(savedReview);
    }
}
