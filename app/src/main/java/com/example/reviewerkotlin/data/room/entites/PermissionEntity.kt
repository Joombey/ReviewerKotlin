package com.example.reviewerkotlin.data.room.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "permissions")
data class PermissionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "review_making")
    val reviewMaking: Boolean,
    val moderating: Boolean,
    val administrating: Boolean
)