package com.example.reviewerkotlin.data.room.entites

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(
    tableName = "reviews",
    indices = [Index(value = ["id", "author_id", "paragraph_id"])],
    foreignKeys = [
        ForeignKey(
            entity = AuthorEntity::class,
            parentColumns = ["id"],
            childColumns = ["author_id"]
        ),
        ForeignKey(
            entity =
        )
    ]
)
data class ReviewEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,
    //Foreign Keys
    @ColumnInfo(name = "author_id")
    var authorId: Int,
    @ColumnInfo(name = "paragraph_id")
    var paragraph: Int,

    var title: String,
    var score: Float,
    var likes: Int,
    var dislikes: Int,
    var reviewCreationTime: Date,
)
