package com.example.daggerhilt

import javax.inject.Inject

const val TAG = "User"

//Constructor Injection
class UserRepository @Inject constructor(private val loggerService: LoggerService) {
    fun saveUser(email: String, password: String) {
       loggerService.log("User has been saved in db")
    }
}