package com.example.loginapplication.data

import com.example.loginapplication.data.model.LoggedInUser
import java.io.IOException

class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), username)
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */