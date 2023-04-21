package com.example.reviewerkotlin.data.repositories

import androidx.lifecycle.LiveData

class ReviewRepositoryImpl(): ReviewRepository {
    override suspend fun fetchData(): LiveData<Any> {
        TODO("Not yet implemented")
    }
}