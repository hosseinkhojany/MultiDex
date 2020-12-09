package com.example.multidex.common

import android.content.Context
import androidx.startup.Initializer
import com.example.multidex.BuildConfig
import timber.log.Timber

class TimberInit : Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d("TimberInitializer is initialized.")
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}