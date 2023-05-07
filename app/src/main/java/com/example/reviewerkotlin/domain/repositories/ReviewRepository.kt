package com.example.reviewerkotlin.domain.repositories

import androidx.lifecycle.LiveData
import com.example.reviewerkotlin.data.room.entites.ReviewEntity
import com.example.reviewerkotlin.domain.models.Review

interface ReviewRepository {
    suspend fun fetchData(): LiveData<ReviewEntity>
    suspend fun addReview(review: Review)
}