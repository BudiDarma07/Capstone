package com.example.capstone.retrofit

data class RegisterResponse(
    val message: String = "",
    val success: Boolean = true //
)

data class LoginResponse(
    val message: String,
    val success: Boolean,
    val accessToken: String,
    val refreshToken: String
)