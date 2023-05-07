package com.example.reviewerkotlin.data.data_sources.sources

import androidx.lifecycle.LiveData
import com.example.reviewerkotlin.data.room.entites.ParagraphEntity
import com.example.reviewerkotlin.data.room.entites.ReviewEntity
import com.example.reviewerkotlin.domain.models.Review

interface RoomDataSource {
    suspend fun fetchData(): LiveData<ReviewEntity>

    suspend fun addReview(review: ReviewEntity)

    suspend fun addParagraph(paragraph: ParagraphEntity)
}