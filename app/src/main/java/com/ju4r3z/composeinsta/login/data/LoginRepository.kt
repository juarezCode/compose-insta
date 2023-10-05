package com.ju4r3z.composeinsta.login.data

import com.ju4r3z.composeinsta.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password: String): Boolean {
        return api.doLogin(user, password)
    }
}