package com.gibson.network.domain.repository

import com.gibson.network.domain.entity.User

interface UserRepository {
    suspend fun getUser(userName: String): User
}