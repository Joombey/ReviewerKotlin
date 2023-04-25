package com.example.reviewerkotlin.data.room.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey

@Entity(
    tableName = "items",
    foreignKeys = [
        ForeignKey(
            entity = PhotoEntity::class,
            parentColumns = ["id"],
            childColumns = ["item_photo_id"],
            onDelete = CASCADE,
            onUpdate = CASCADE,
            deferred = true
        )
    ]
)
data class ItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "item_name")
    val itemName: String,
    @ColumnInfo(name = "price")
    val price: Float,
    @ColumnInfo
    val currency: String,
    @ColumnInfo(name = "weight")
    val weight: Float,
    @ColumnInfo(name = "item_photo_id")
    val itemPhotoId: Int,
    val Shop: String?
)
