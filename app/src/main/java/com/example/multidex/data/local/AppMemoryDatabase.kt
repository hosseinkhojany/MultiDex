package com.example.multidex.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.multidex.data.local.dao.SmsDao
import com.example.multidex.data.local.dao.UserAccountDao
import com.example.multidex.data.local.entity.Sms
import com.example.multidex.data.local.entity.UserAccount

@Database(entities = [Sms::class], version = 1, exportSchema = true)
abstract class AppMemoryDatabase : RoomDatabase() {

    abstract fun smsDao(): SmsDao

}