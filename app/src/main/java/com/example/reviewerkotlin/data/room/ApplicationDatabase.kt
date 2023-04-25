package com.example.reviewerkotlin.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.reviewerkotlin.data.room.entites.AuthorEntity
import com.example.reviewerkotlin.data.room.entites.ReviewEntity

@Database(
    entities = [ReviewEntity::class, AuthorEntity::class],
    version = 1,
    exportSchema = true,
)
abstract class Database: RoomDatabase() {


    companion object{
        
    }
}