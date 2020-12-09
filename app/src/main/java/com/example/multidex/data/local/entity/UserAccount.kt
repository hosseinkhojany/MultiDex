package com.example.multidex.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.multidex.utils.USER_TABLE

@Entity(tableName = USER_TABLE)
data class UserAccount(@PrimaryKey val id:Int, val name:String)