package com.example.reviewerkotlin.presentation.reviews_feed

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.concurrent.thread


class ReviewsFeedViewModel : ViewModel() {
    private val _reviews: MutableLiveData<Int> = MutableLiveData(1)

    fun startReviewFetching(){
        viewModelScope.launch {

        }
    }
}