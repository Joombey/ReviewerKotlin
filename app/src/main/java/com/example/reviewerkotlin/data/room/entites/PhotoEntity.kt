package com.example.reviewerkotlin.data.room.entites

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class PhotoEntity(
    @PrimaryKey
    val id: String,
    val uri: String?,
    val link: String?,
)
