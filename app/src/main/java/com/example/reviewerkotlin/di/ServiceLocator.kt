package com.example.reviewerkotlin.di

import com.example.reviewerkotlin.data.data_sources.implementations.RoomDataSourceImpl
import com.example.reviewerkotlin.data.repository_impls.ReviewRepositoryImpl
import com.example.reviewerkotlin.domain.repositories.ReviewRepository

object ServiceLocator {
    private var localDataSource = RoomDataSourceImpl()
    private var reviewRepositoryImpl = ReviewRepositoryImpl(localDataSource)

    var reviewRepository: ReviewRepository? = null
        get() {
            if (field == null){
                field = reviewRepositoryImpl
            }
            return field
        }
        set(value) {
            if(value != null)
                field = value
        }
}