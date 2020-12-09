package com.example.multidex.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.multidex.data.local.dao.SmsDao
import com.example.multidex.data.local.dao.UserAccountDao
import com.example.multidex.data.local.entity.Sms
import com.example.multidex.data.local.entity.UserAccount

@Database(entities = [UserAccount::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserAccountDao

}