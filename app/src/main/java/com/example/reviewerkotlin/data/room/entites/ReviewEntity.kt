package com.example.reviewerkotlin.data.room.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.ForeignKey.Companion.RESTRICT
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Date
import java.util.UUID

@Entity(
    tableName = "reviews",
    indices = [Index(value = ["id", "author_id", "paragraph_id"])],
    foreignKeys = [
        ForeignKey(
            entity = AuthorEntity::class,
            parentColumns = ["id"],
            childColumns = ["author_id"],
            onDelete = CASCADE,
            onUpdate = CASCADE,
            deferred = true
        ),
        ForeignKey(
            entity = ParagraphEntity::class,
            parentColumns = ["id"],
            childColumns = ["paragraph_id"],
            onDelete = RESTRICT,
            onUpdate = CASCADE,
            deferred = true
        ),
        ForeignKey(
            entity = ItemEntity::class,
            parentColumns = ["id"],
            childColumns = ["item_id"],
            onDelete = CASCADE,
            onUpdate = CASCADE
        )
    ]
)
data class ReviewEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String = UUID.randomUUID().toString(),
    //Foreign Keys
    @ColumnInfo(name = "author_id")
    @PrimaryKey
    val authorId: String,
    @ColumnInfo(name = "paragraph_id")
    val paragraphId: String?,
    @ColumnInfo(name = "item_id")
    val itemId: String,


    val title: String,
    @ColumnInfo(defaultValue = "0")
    var score: Float,
    @ColumnInfo(defaultValue = "0")
    val likes: Int,
    @ColumnInfo(defaultValue = "0")
    var dislikes: Int,
    @ColumnInfo(name = "creation_time")
    val reviewCreationTime: Date,
)
