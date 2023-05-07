package com.example.reviewerkotlin.domain.review_feed_use_cases

import com.example.reviewerkotlin.domain.models.Review
import com.example.reviewerkotlin.domain.repositories.ReviewRepository
import java.util.UUID

class CreateReviewUseCase(
    private val reviewRepository: ReviewRepository
) {
    suspend operator fun invoke(review: Review){
        reviewRepository.addReview(
            review.copy(id = generateUUID())
        )
    }
    private fun generateUUID() = UUID.randomUUID().toString()
}