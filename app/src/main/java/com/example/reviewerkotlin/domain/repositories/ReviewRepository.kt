package com.example.reviewerkotlin.data.repositories

import androidx.lifecycle.LiveData

interface ReviewRepository {
    suspend fun fetchData(): LiveData<Any>
}