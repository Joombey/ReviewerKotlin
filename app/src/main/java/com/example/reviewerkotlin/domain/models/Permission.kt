package com.example.reviewerkotlin.domain.models

data class Permission(
   val id: String,
   val reviewMakingAccess: Boolean = false,
   val moderationAccess: Boolean = false,
   val administratingAccess: Boolean = false
)