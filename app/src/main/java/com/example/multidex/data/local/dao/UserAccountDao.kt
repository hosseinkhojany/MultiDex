package com.example.multidex.data.local.dao

import androidx.room.*
import com.example.multidex.data.local.entity.UserAccount
import com.example.multidex.utils.USER_TABLE

@Dao
interface UserAccountDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(userAccountDetail: UserAccount)

    @Delete
    suspend fun deleteAccount(userAccountDetail: UserAccount)

    @Query("SELECT * FROM $USER_TABLE WHERE id = :id")
    suspend fun getAccount(id: Int): UserAccount

    @Query("SELECT * FROM $USER_TABLE")
    suspend fun getAccounts(): List<UserAccount>
}