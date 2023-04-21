package com.example.reviewerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.reviewerkotlin.databinding.ActivityMainBinding
import com.example.reviewerkotlin.presentation.reviews_feed.ReviewsFeed
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @OptIn(ExperimentalTime::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lifecycleScope.launchWhenStarted {
            //TODO: Временный вариант поменять позже на инициализацию с последнего состояния
            repeatOnLifecycle(Lifecycle.State.STARTED){
                supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
                    .add(binding.container.id, ReviewsFeed.newInstance())
                    .commit()
            }
        }
    }

}