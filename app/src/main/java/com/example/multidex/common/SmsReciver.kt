package com.example.multidex.common

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import timber.log.Timber


@SuppressLint("BinaryOperationInTimber")
class SmsReciver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Timber.d(""+intent!!.extras.toString())
    }
}