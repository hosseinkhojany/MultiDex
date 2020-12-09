package com.example.multidex.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.multidex.utils.SMS_TABLE

@Entity(tableName = SMS_TABLE)
data class Sms(@PrimaryKey val id : Int,
                val title:String ,
               val body: String)
