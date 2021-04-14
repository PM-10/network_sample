package com.gibson.network.api

import com.gibson.network.domain.entity.User
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/users/{userName}")
    suspend fun getUser(@Path("userName") userName: String): User
}