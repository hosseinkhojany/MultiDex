package com.example.multidex.di

import android.app.Application
import androidx.room.Room
import com.example.multidex.data.local.AppDatabase
import com.example.multidex.data.local.AppMemoryDatabase
import com.example.multidex.utils.APP_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    /* provide database */

    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application
    ): AppDatabase {
        return Room
            .databaseBuilder(application, AppDatabase::class.java, APP_DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }
//    @Provides
//    @Singleton
//    fun provideMemoryDatabase(
//        application: Application
//    ): AppMemoryDatabase {
//        return Room.inMemoryDatabaseBuilder(application, AppMemoryDatabase::class.java).build()
//    }
}