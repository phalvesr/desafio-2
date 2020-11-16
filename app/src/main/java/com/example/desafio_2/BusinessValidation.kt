package com.example.desafio_2

class Validation {

    fun isEmailValid (email: String): Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8
    }

    fun areRegisterPasswordValid(password: String, confirmedPassword: String): Boolean {
        if (password.isBlank() ||
            confirmedPassword.isBlank() ||
            password != confirmedPassword ||
            password.length < 8 ||
            confirmedPassword.length < 8) {
            return false
        }
        return true
    }
}
