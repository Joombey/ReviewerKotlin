package com.example.reviewerkotlin.domain.models

import com.example.reviewerkotlin.domain.models.utils.PhotoSource
import java.util.UUID

data class Paragraph(
    val id: String,
    val title: String,
    val text: String,
    val photos: List<PhotoSource>
)
