package com.example.reviewerkotlin.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.reviewerkotlin.data.room.entites.AuthorEntity
import com.example.reviewerkotlin.data.room.entites.ReviewEntity

@Database(
    entities = [ReviewEntity::class, AuthorEntity::class],
    version = 1,
    exportSchema = true,
)
abstract class ApplicationDatabase: RoomDatabase() {
    companion object{
        private var INSTANCE: ApplicationDatabase? = null
        fun getDatabase(context: Context): ApplicationDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}