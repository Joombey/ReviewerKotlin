package com.example.reviewerkotlin.data.data_sources.sources

import androidx.lifecycle.LiveData
import com.example.reviewerkotlin.data.room.entites.ReviewEntity

interface RoomDataSource {
    suspend fun fetchData(): LiveData<ReviewEntity>
}