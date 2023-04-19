package com.example.reviewerkotlin.presentation.reviews_feed

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.concurrent.thread


class ReviewsFeedViewModel : ViewModel() {
    private val _reviews: MutableLiveData<Int> = MutableLiveData(1)

    fun startReviewFetching() {
        viewModelScope.launch() {
            launch {
                while(true) {
                    println(123)
                }
            }
            launch {
                while(true) {
                    println(-Int.MAX_VALUE)
                }
            }
            println(viewModelScope.isActive)
        }
    }

    override fun onCleared() {
        super.onCleared()
        println(viewModelScope.isActive)
    }
}