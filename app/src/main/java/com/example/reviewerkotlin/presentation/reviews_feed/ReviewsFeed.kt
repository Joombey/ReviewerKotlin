package com.example.reviewerkotlin.presentation.reviews_feed

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
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
        Toast.makeText(context, "STARTED", Toast.LENGTH_SHORT).show()
        viewModel.startReviewFetching()
    }
}