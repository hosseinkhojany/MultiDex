package com.example.multidex.data.respository

import androidx.annotation.WorkerThread
import com.example.multidex.data.local.dao.UserAccountDao
import com.example.multidex.data.local.entity.Sms
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject;

class UserAccountRepository @Inject constructor(private val smsDao: UserAccountDao){

    @WorkerThread
    fun fetchSmSs() = flow<List<Sms>>{



    }.flowOn(Dispatchers.IO)

    @WorkerThread
    fun fetchLoginDatas(){

    }

}