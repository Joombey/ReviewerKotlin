package com.example.reviewerkotlin.domain

import com.example.reviewerkotlin.data.repositories.ReviewRepository

class FetchingAllReviewsUseCase(
    private val reviewRepository: ReviewRepository
) {
    suspend operator fun invoke(){
        reviewRepository.fetchData()
    }
}