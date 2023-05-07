package com.example.reviewerkotlin.di

import android.content.Context
import com.example.reviewerkotlin.data.room.ApplicationDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    private fun getDb (
        @ApplicationContext
        applicationContext: Context
    ) : ApplicationDatabase {
        return ApplicationDatabase.getDatabase(applicationContext)
    }

    @Provides
    @Singleton
    fun getReviewDao(database: ApplicationDatabase){
        database.reviewDao()
    }
}