package com.example.multidex.di

import com.example.multidex.data.network.AppNetworkClient
import com.example.multidex.data.network.AppNetworkService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import org.komamitsu.retrofit.converter.msgpack.MessagePackConverterFactory
import org.msgpack.core.MessageBufferPacker
import org.msgpack.core.buffer.MessageBuffer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /* network config */

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://pokeapi.co/")
            .addConverterFactory(MessagePackConverterFactory.create())
            .build()
    }



    //init network service class to make request
    @Provides
    @Singleton
    fun provideAppNetworkService(retrofit: Retrofit): AppNetworkService {
        return retrofit.create(AppNetworkService::class.java)
    }

    //init network client to fetch request
    @Provides
    @Singleton
    fun provideAppNetworkClient(provideAppNetworkService: AppNetworkService): AppNetworkClient {
        return AppNetworkClient(provideAppNetworkService)
    }


}