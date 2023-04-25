package com.example.reviewerkotlin.domain.repositories

import androidx.lifecycle.LiveData
import com.example.reviewerkotlin.data.room.entites.ReviewEntity

interface ReviewRepository {
    suspend fun fetchData(): LiveData<ReviewEntity>
}