package com.example.multidex.di

import com.example.multidex.data.local.dao.SmsDao
import com.example.multidex.data.local.dao.UserAccountDao
import com.example.multidex.data.respository.SmsRepository
import com.example.multidex.data.respository.UserAccountRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
object RepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideSmsRepository(smsDao: SmsDao): SmsRepository{
        return SmsRepository(smsDao)
    }

    @Provides
    @ActivityRetainedScoped
    fun provideUserRepository(userAccountDao: UserAccountDao): UserAccountRepository{
        return UserAccountRepository(userAccountDao)
    }


}