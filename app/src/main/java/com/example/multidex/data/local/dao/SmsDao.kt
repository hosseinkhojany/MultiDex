package com.example.multidex.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.multidex.data.local.entity.Sms
import com.example.multidex.data.local.entity.UserAccount
import com.example.multidex.utils.SMS_TABLE

@Dao
interface SmsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSms(sms: Sms)

    @Query("SELECT * FROM $SMS_TABLE WHERE id= :id")
    suspend fun getSms(id: Int): Sms

    @Query("SELECT * FROM $SMS_TABLE")
    suspend fun getAllSms(): List<Sms>

}