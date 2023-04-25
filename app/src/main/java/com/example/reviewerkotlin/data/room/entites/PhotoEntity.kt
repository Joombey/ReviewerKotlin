package com.example.reviewerkotlin.data.room.entites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uri: String?,
    val link: String?,
    val token: String,
)
