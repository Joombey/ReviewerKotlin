package com.example.reviewerkotlin.domain.models

data class Permission(
   val reviewMakingAccess: Boolean = false,
   val moderationAccess: Boolean = false,
   val administratingAccess: Boolean = false
)