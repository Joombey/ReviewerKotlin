package com.example.reviewerkotlin.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ReviewRepositoryImpl(
    val dataSource: Any
): ReviewRepository {
    override suspend fun fetchData(): LiveData<Any> {
        return MutableLiveData<Any>()
    }
}