package com.example.reviewerkotlin.domain.models

import com.example.reviewerkotlin.domain.models.utils.PhotoSource

data class Paragraph(
    val title: String,
    val text: String,
    val photos: List<PhotoSource>
)
