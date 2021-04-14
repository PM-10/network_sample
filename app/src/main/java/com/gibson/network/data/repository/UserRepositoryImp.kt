package com.gibson.network.data.repository

import com.gibson.network.api.ApiService
import com.gibson.network.domain.entity.User
import com.gibson.network.domain.repository.UserRepository

class UserRepositoryImp(
    private val apiService: ApiService
) : UserRepository {

    override suspend fun getUser(userName: String): User = apiService.getUser(userName)
}