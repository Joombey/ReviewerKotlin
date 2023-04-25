package com.example.reviewerkotlin.presentation.reviews_feed_presentation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reviewerkotlin.R

class ReviewsFeed : Fragment() {

    companion object {
        fun newInstance() = ReviewsFeed()
    }

    private lateinit var viewModel: ReviewsFeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reviews_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[ReviewsFeedViewModel::class.java]
        viewModel.startReviewFetching()
    }
}