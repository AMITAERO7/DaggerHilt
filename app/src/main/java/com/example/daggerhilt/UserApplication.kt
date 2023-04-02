package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {
    //Field Injection
    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreate() {
        super.onCreate()
        userRepository.saveUser("Amit","Kumar")
    }
}