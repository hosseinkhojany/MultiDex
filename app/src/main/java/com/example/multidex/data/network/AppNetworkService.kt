package com.example.multidex.data.network

import androidx.lifecycle.LiveData
import com.example.multidex.data.local.entity.UserAccount
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface AppNetworkService{

    /* retrofit placeholder */

    @GET("login/{code}")
    suspend fun fetchLoginDetail(@Path("code") name: String): Response<UserAccount>
}
