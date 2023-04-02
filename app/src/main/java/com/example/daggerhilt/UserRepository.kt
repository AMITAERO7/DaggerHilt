package com.example.daggerhilt

import javax.inject.Inject

const val TAG = "User"

interface UserRepository {
    fun saveUser(email: String, password: String)

}

class FirebaseRepository @Inject constructor(private val loggerService: LoggerService): UserRepository {
    override fun saveUser(email: String, password: String) {
       loggerService.log("User has been saved in firebase db")
    }
}

class LocalDatabaseRepository @Inject constructor(private val loggerService: LoggerService): UserRepository {
    override fun saveUser(email: String, password: String) {
        loggerService.log("User has been saved in local db")
    }
}