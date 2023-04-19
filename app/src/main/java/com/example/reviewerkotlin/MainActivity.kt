package com.example.reviewerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
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
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .add(binding.container.id, ReviewsFeed.newInstance())
            .commit()
        lifecycleScope.launchWhenCreated {
            val a = measureTime {
                delay(5 * 1000)
                supportFragmentManager.popBackStack()
            }
            Toast.makeText(this@MainActivity, "$a", Toast.LENGTH_SHORT).show()
        }
    }

}