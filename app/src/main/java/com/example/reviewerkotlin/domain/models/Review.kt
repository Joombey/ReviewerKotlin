package com.example.reviewerkotlin.domain.models

import java.sql.Date


data class Review(
   val id: String,
   val reviewAuthor: Author,
   val reviewParagraphs: List<Paragraph>,
   val reviewItem: Item,
   val reviewTitle: String,
   val reviewCreationTime: Date,
   val likes: Int,
   val dislikes: Int,
) {
   val score: Float
      get() = (likes / dislikes).toFloat()
}