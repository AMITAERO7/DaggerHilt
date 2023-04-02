package com.example.daggerhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class UserModule {
    @Binds
    @FirebaseImp
    abstract fun bindsFirebaseRepository(firebaseRepository: FirebaseRepository): UserRepository

    @Binds
    @LocalImpl
    abstract fun bindsSqlRepository(localDatabaseRepository: LocalDatabaseRepository): UserRepository
}