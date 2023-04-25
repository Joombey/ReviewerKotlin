package com.example.reviewerkotlin.domain.review_feed_use_cases

import com.example.reviewerkotlin.domain.repositories.ReviewRepository

class FetchingAllReviewsUseCase(
    private val reviewRepository: ReviewRepository
) {
    suspend operator fun invoke(){
        reviewRepository.fetchData()
    }
}