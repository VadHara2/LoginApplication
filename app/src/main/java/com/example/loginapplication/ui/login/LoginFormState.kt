package com.example.loginapplication.ui.login


data class LoginFormState(val usernameError: Int? = null,
                          val passwordError: Int? = null,
                          val isDataValid: Boolean = false)

/**
 * Data validation state of the login form.
 */