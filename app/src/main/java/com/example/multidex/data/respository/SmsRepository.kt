package com.example.multidex.data.respository

import androidx.annotation.WorkerThread
import com.example.multidex.data.local.dao.SmsDao
import com.example.multidex.data.local.entity.Sms
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject;

class SmsRepository @Inject constructor(private val smsDao: SmsDao){

    @WorkerThread
    fun fetchSmSs() = flow<List<Sms>>{



    }.flowOn(Dispatchers.IO)

}