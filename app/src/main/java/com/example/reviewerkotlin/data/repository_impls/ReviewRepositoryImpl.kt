package com.example.reviewerkotlin.data.repository_impls

import androidx.lifecycle.LiveData
import com.example.reviewerkotlin.data.data_sources.sources.RoomDataSource
import com.example.reviewerkotlin.data.room.entites.ReviewEntity
import com.example.reviewerkotlin.domain.repositories.ReviewRepository

class ReviewRepositoryImpl(
    val dataSource: RoomDataSource
): ReviewRepository {
    override suspend fun fetchData(): LiveData<ReviewEntity> {
        return dataSource.fetchData()
    }
}