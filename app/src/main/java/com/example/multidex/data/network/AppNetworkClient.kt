package com.example.multidex.data.network

import com.example.multidex.data.local.entity.UserAccount
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject


class AppNetworkClient @Inject constructor(private val networking: AppNetworkService){

    /* network fetcher (interactor) */

    suspend fun login(code: String , doWhenSuccess: (Response<UserAccount>) -> Unit)
    :Response<UserAccount> = networking.fetchLoginDetail(code)


}