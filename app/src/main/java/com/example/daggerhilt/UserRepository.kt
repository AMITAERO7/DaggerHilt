package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

const val TAG = "User"

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in db!!!")
    }
}