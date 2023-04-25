package com.example.reviewerkotlin.domain.models

import com.example.reviewerkotlin.domain.models.utils.AuthService
import com.example.reviewerkotlin.domain.models.utils.PhotoSource
import java.util.Date

data class Author(
    val name: String,
    val photoSource: PhotoSource,
    val accountCreationTime: Date,
    val authService: AuthService,
    val permissions: Permission
)
