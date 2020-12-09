package com.example.multidex.data.respository

import android.provider.Telephony
import androidx.annotation.WorkerThread
import com.example.multidex.data.local.dao.SmsDao
import com.example.multidex.data.local.entity.Sms
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject;
import javax.inject.Singleton

class SmsRepository @Inject constructor(private val smsDao: SmsDao){

    @WorkerThread
    fun fetchSmSs() = flow<List<Sms>>{



    }.flowOn(Dispatchers.IO)

}