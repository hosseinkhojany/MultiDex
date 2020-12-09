package com.example.multidex.common

import com.example.multidex.data.local.entity.UserAccount

interface UserLoginState{

    fun onSuccess(userAccount: UserAccount , doWork : () -> Unit)
    fun onFail(error: String)

}

