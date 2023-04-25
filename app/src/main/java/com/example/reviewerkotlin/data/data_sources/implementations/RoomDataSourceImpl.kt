package com.example.reviewerkotlin.data.data_sources.implementations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.reviewerkotlin.data.data_sources.sources.RoomDataSource
import com.example.reviewerkotlin.data.room.entites.ReviewEntity

class RoomDataSourceImpl: RoomDataSource {
    override suspend fun fetchData(): LiveData<ReviewEntity> {
//        TODO(CREATE DATA FETCHING FROM DB)
        return MutableLiveData()
    }
}