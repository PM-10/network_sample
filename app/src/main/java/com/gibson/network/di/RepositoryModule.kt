package com.gibson.network.di

import com.gibson.network.api.ApiService
import com.gibson.network.data.repository.UserRepositoryImp
import com.gibson.network.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    fun provideUserRepository(
        apiService: ApiService
    ): UserRepository = UserRepositoryImp(apiService)
}