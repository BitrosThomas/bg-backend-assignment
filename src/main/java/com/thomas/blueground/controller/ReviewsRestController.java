package com.thomas.blueground.controller;

import com.thomas.blueground.model.ReviewModel;
import com.thomas.blueground.service.ReviewService;
import com.thomas.blueground.service.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReviewsRestController {

    @Autowired
    ReviewService reviewService;

    @PostMapping(path= "/api/")
    public ResponseEntity<ReviewModel> create(@RequestBody ReviewModel review) {
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewService.create(review));
    }

}
