package com.example.reviewerkotlin.data.room.entites

import androidx.room.PrimaryKey
import java.time.LocalDateTime

data class AuthorEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val reviewId: Int,
    val accountCreationDate: LocalDateTime,
)
