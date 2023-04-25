package com.example.reviewerkotlin.presentation.reviews_feed_presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class ReviewsFeedViewModel : ViewModel() {
    private val _reviews: MutableLiveData<Int> = MutableLiveData(1)

    fun startReviewFetching(){
        viewModelScope.launch {

        }
    }
}