package com.example.foodservice.service;
import com.example.foodservice.domain.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {

    public Review saveReview(Review newReview);
    public List<Review> getReviews();
}
