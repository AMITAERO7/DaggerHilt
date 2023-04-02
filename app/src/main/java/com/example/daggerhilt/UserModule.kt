package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class UserModule {
    @Provides
    fun provideFirebaseRepository (loggerService: LoggerService): UserRepository {
        return FirebaseRepository(loggerService)
    }
}