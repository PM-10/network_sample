package com.gibson.network.domain.usecase

import com.gibson.network.domain.repository.UserRepository
import javax.inject.Inject

class UserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend fun getUser(userName: String) = userRepository.getUser(userName)

}